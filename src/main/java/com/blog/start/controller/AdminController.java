package com.blog.start.controller;

import com.blog.start.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MahfuzCSE'11 on 14-Oct-16.
 */
@Controller
@RequestMapping("/users")
public class AdminController {


    @Autowired
    private UserService userService;


    @RequestMapping
    public String users(Model model) {


        model.addAttribute("users", userService.findAll());

        return "users";
    }

    @RequestMapping("/{id}")
    public String details(Model model, @PathVariable int id) {


        model.addAttribute("user", userService.findOneWithBlogs(id));

        return "user-detail";

    }


    @RequestMapping("/remove/{id}")
    public String userRemove(@PathVariable int id) {
        userService.delete(id);
        return "redirect:/users";

    }

}
