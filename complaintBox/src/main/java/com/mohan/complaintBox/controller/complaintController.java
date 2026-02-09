package com.mohan.complaintBox.controller;


import com.mohan.complaintBox.models.Complaint;
import com.mohan.complaintBox.service.ComplaintService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class complaintController {

private final ComplaintService complaintService;

public complaintController(ComplaintService complaintService){
    this.complaintService = complaintService;
}

    @GetMapping("/home")
    public String homePage(){
        return "home";
    }

    @PostMapping("/complaint")
    public String addComplaint(
            @ModelAttribute Complaint complaint){
        complaintService.addComplaint(complaint.getName(),
                complaint.getEmail(),
                complaint.getMessage());
        return "redirect:/home";
    }



}



