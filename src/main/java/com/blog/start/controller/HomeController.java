package com.blog.start.controller;

import com.blog.start.jpa.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MahfuzCSE'11 on 11-Oct-16.
 */

@Controller
public class HomeController {


    @Autowired
    private ItemService itemService;

    @RequestMapping("/")
    public String home(Model model) {


        model.addAttribute("item", itemService.getItems());

        return "home";
    }
}
