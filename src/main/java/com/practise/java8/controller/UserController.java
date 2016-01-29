package com.practise.java8.controller;

import com.practise.java8.model.Goal;
import com.practise.java8.model.User;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


@Controller
@SessionAttributes("user")
public class UserController {

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUserForm(Model model) {
        User user = new User();
        user.setName("username");
        user.setEmail("email");

        model.addAttribute("userDetails","Enter User Details" );
        model.addAttribute(user);

        System.out.println("In Get ");
        return "addUser";
    }



    @RequestMapping(value = "/addUser", method = RequestMethod.POST )
    public String addUserSubmit(@Valid @ModelAttribute("user") User user, BindingResult result) {

        System.out.println("Result has error " + result.hasErrors());
        if (result.hasErrors()) {
            System.out.println(" Error " + result.hasErrors());
            return "addUser";

        }
       // model.addAttribute(user);
        return "redirect:addUser";

    }
}


