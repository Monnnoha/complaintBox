package com.mohan.complaintBox.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class complaintController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

}
