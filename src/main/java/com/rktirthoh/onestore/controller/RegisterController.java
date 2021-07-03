package com.rktirthoh.onestore.controller;

import com.rktirthoh.onestore.dao.UserRepository;
import com.rktirthoh.onestore.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegisterController {

    @Autowired
    UserRepository repository;

    @PostMapping("/register")
    public String doRegister(@Valid @ModelAttribute User user,
                             BindingResult result
    ) {


        System.out.println(user.getEmail());
        System.out.println(user.getUsername());

        return "/register";
    }
}
