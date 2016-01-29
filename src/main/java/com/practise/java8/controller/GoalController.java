package com.practise.java8.controller;

import com.practise.java8.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;


@Controller
public class GoalController {

    @RequestMapping(value="/addGoal", method = RequestMethod.GET)
    public String addGoal(Model model){
        Goal goal= new Goal();
        goal.setMinutes(10);
        model.addAttribute("goal",goal);

        return "addGoal";
    }

    @RequestMapping(value = "/addGoal" , method = RequestMethod.POST)
    public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result){

        System.out.println("Result has error "+result.hasErrors());
        System.out.println("Minutes Updated:  "+goal.getMinutes());

        if (result.hasErrors()){
            return "addGoal";
        }
        return "redirect:addMinutes";
    }

}
