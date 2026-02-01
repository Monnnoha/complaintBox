package com.mohan.complaintBox.controller;


import com.mohan.complaintBox.service.ComplaintService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping("/home")
    public String addComplaint(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message
    ){
        complaintService.addComplaint(name, email, message);
        return "redirect:/home";
    }

}



