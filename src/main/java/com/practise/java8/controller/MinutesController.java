package com.practise.java8.controller;

import com.practise.java8.model.Activity;
import com.practise.java8.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MinutesController {

    @RequestMapping(value="/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise ){


       // model.addAttribute("minutes","Added Minutes");
        System.out.println("exercise " + exercise.getMinutes() );
        return "addMinutes";

    }


    @RequestMapping(value="/activities",method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities(){

        List<Activity> activities = new ArrayList<Activity>();

        Activity run= new Activity();
        run.setDesc("Run");
        activities.add(run);

        Activity bike= new Activity();
        bike.setDesc("Bike");
        activities.add(bike);

        Activity swim= new Activity();
        swim.setDesc("swim");
        activities.add(swim);

        System.out.println("The List of activities "+ activities.toString());

        return activities;

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
