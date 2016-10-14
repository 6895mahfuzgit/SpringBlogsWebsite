package com.blog.start.controller;

import com.blog.start.jpa.entity.User;
import com.blog.start.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by MahfuzCSE'11 on 14-Oct-16.
 */
@Controller
public class RegisterController {


    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String showRegisterForm() {


        return "user-register";

    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegisterForm(@Valid @ModelAttribute("user") User user, BindingResult result, RedirectAttributes redirectAttributes) {


        if (result.hasErrors()) {
            return "user-register";
        }

        redirectAttributes.addFlashAttribute("success", true);
        userService.save(user);
        return "redirect:/register";

    }

}
