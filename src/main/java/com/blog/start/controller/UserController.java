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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
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
    public String doRegisterForm(@Valid @ModelAttribute("user") User user, BindingResult result, RedirectAttributes redirectAttributes) {


        if (result.hasErrors()) {
            return "user-register";
        }

        redirectAttributes.addFlashAttribute("success", true);
        userService.save(user);
        return "redirect:/register";

    }


    @RequestMapping("/account")
    public String account(Model model, Principal principal) {
        String name = principal.getName();
        model.addAttribute("user", userService.findOneWithBlogs(name));
        return "user-detail";

    }

    @RequestMapping(value = "/account", method = RequestMethod.POST)
    public String doRegister(Model model, @Valid @ModelAttribute("blog") Blog blog, BindingResult result, Principal principal, RedirectAttributes redirectAttributes) {


        if (result.hasErrors()) {

            return account(model, principal);
        }


        String name = principal.getName();
        blogService.save(blog, name);
        redirectAttributes.addFlashAttribute("blogadded", true);
        return "redirect:/account";

    }


    @RequestMapping("/blog/remove/{id}")
    public String deleteBlog(@PathVariable int id) {

        Blog blog = blogService.findOne(id);

        blogService.delete(blog);
        return "redirect:/account";

    }


    @RequestMapping("/users/remove/{id}")
    public String userRemove(@PathVariable int id) {
        userService.delete(id);
        return "redirect:/users";

    }


}
