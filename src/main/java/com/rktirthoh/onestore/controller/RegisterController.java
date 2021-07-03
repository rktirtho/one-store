package com.rktirthoh.onestore.controller;

import com.rktirthoh.onestore.dao.UserRepository;
import com.rktirthoh.onestore.entity.user.User;
import com.rktirthoh.onestore.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegisterController {

    @Autowired
    EmailSenderService emailSenderService;

    @Autowired
    UserRepository repository;

    @GetMapping("register")
    public String loadRegister(Model model){
        User user = new User();
        user.setEmail("rktirhto@gmail.com");
        user.setUsername("dfdf");
        user.setPassword("rdsdsdrw");
        model.addAttribute("user", user);

        return "signup";
    }

    @PostMapping("/registerCheckout")
    public String doRegister(@Valid @ModelAttribute("user") User user,
                             BindingResult result, Model model) {
        if(result.hasErrors()){
            return "register";
        }

        emailSenderService.sentSimpleEmail("rktirtho@gmail.com", "Confirm your account", "https://rktirtho.me");

        String massage = "A verification code sent to <b>"+ user.getEmail()
                +"</b>. Please confirm your email address by clicking this link ";
        model.addAttribute("massage", massage);
        return "common/show-info";
    }
}
