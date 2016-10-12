package com.blog.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MahfuzCSE'11 on 13-Oct-16.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {

        return "login";
    }
}
