package com.blog.start.controller;

import com.blog.start.jpa.entity.Blog;
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


    @ModelAttribute("blog")
    public Blog constructBlog() {

        return new Blog();
    }


    @RequestMapping("/account")
    public String account(Model model, Principal principal) {
        String name = principal.getName();
        model.addAttribute("user", userService.findOneWithBlogs(name));
        return "account";

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


}
