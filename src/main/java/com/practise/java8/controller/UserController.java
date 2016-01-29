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

/**
 * Created by sethishi on 29/01/2016.
 */
@Controller
@SessionAttributes("user")
public class UserController {

//    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
//    public String addUser(Model model) {
//        User user = new User();
//        user.setName("Shilpa");
//        user.setEmail("hsdsd@gmal.com");
//
//        model.addAttribute(user);
//
//
//        return "addUser";
//    }



    @RequestMapping(value = "/addUser", method = { RequestMethod.GET, RequestMethod.POST })
    public String addUserOnly(@Valid @ModelAttribute("user") User user, Model model,
                              BindingResult result, HttpServletRequest request)
            throws ParseException {

        if (result.hasErrors()){
            System.out.println(" Error "+ result.hasErrors());
            return "adduser";
        }
        model.addAttribute(user);
        return "redirect:addUser";
    }

}


