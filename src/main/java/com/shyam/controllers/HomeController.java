package com.shyam.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    
    @ResponseBody
    @GetMapping("/")
    public String idnex(){
        return "Hello, World";
    }
    
    @ResponseBody
    @GetMapping("/about")
    public Object about(){
        return SecurityContextHolder.getContext().getAuthentication();
    }

}
