package com.rktirthoh.onestore.controller;

import com.rktirthoh.onestore.entity.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class LoginController {

    @GetMapping("login")
    public String loadLogin(){
        return "login";
    }



    @GetMapping("forgot-password")
    public String loadForgotAccount(){
        return "forgot-password";
    }


}
