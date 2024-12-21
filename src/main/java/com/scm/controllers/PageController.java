package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;



@Controller
public class PageController {

    @RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home page requested");
        model.addAttribute("greeting", "Welcome to Spring MVC");
        
        return "home";
    
    }
}
 