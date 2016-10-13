package com.blog.start.controller;

import com.blog.start.jpa.entity.Blog;
import com.blog.start.jpa.entity.User;
import com.blog.start.jpa.repositorie.BlogRepository;
import com.blog.start.jpa.repositorie.ItemRepository;
import com.blog.start.jpa.service.BlogService;
import com.blog.start.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
@Controller
public class UserController {


    @Autowired
    private UserService userService;


    @Autowired
    private BlogService blogService;


    @ModelAttribute("user")
    public User construct() {

        return new User();
    }

    @ModelAttribute("blog")
    public Blog constructBlog() {

        return new Blog();
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


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegisterForm(@ModelAttribute("user") User user, RedirectAttributes redirectAttributes) {

        userService.save(user);
        redirectAttributes.addFlashAttribute("success", true);
        return "redirect:/register";

    }


    @RequestMapping("/account")
    public String personaldetails(Model model, Principal principal) {


        String name = principal.getName();
        model.addAttribute("user", userService.findOneWithBlogs(name));

        return "user-detail";

    }

    @RequestMapping(value = "/account", method = RequestMethod.POST)
    public String doRegister(@ModelAttribute("blog") Blog blog, Principal principal, RedirectAttributes redirectAttributes) {

        String name = principal.getName();

        blogService.save(blog, name);

        redirectAttributes.addFlashAttribute("blogadded", true);
        return "redirect:/account";

    }


    @RequestMapping("/blog/remove/{id}")
    public String deleteBlog(@PathVariable int id) {


        blogService.delete(id);
        return "redirect:/account";

    }


}
