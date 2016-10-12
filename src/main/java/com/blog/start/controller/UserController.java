package com.blog.start.controller;

import com.blog.start.jpa.entity.User;
import com.blog.start.jpa.repositorie.BlogRepository;
import com.blog.start.jpa.repositorie.ItemRepository;
import com.blog.start.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
@Controller
public class UserController {


    @Autowired
    private UserService userService;


    @ModelAttribute("user")
    public User construct() {

        return new User();
    }

    @RequestMapping("/users")
    public String users(Model model) {


        model.addAttribute("users", userService.findAll());

        return "users";
    }

    @RequestMapping("/users/{id}")
    public String details(Model model, @PathVariable int id) {


        model.addAttribute("user", userService.findOneWithBlogs(id));

        return "user-detail";

    }


    @RequestMapping("/register")
    public String showRegisterForm() {


        return "user-register";

    }


}
