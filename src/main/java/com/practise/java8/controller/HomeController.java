package com.practise.java8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {

    @RequestMapping(value="/greeting")
    public String sayHello(Model model){
        System.out.println(" Hello ");

        model.addAttribute("greeting","Hello World");
        return "hello";

    }
}
