package com.blog.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MahfuzCSE'11 on 11-Oct-16.
 */

@Controller
public class HomeController {


    @RequestMapping("/")
    public String home(){

        return "home";
    }
}
