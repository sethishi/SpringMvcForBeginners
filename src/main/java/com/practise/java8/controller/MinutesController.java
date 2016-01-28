package com.practise.java8.controller;

import com.practise.java8.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MinutesController {

    @RequestMapping(value="/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise ){


       // model.addAttribute("minutes","Added Minutes");
        System.out.println("exercise " + exercise.getMinutes() );
        return "addMinutes";

    }

//    @RequestMapping(value="/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise ){
//
//        System.out.println(" This is dummy");
//        // model.addAttribute("minutes","Added Minutes");
//        System.out.println("exercising " + exercise.getMinutes() );
//        return "addMinutes";
//
//    }

}
