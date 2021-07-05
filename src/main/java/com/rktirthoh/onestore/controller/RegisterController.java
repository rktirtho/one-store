package com.rktirthoh.onestore.controller;

import com.rktirthoh.onestore.dao.UserRepository;
import com.rktirthoh.onestore.entity.user.Token;
import com.rktirthoh.onestore.entity.user.User;
import com.rktirthoh.onestore.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Base64;
import java.util.UUID;

@Controller
public class RegisterController {

    @Autowired
    EmailSenderService emailSenderService;

    @Autowired
    UserRepository repository;


    private Base64 passwordEncoder ;

    @GetMapping("register")
    public String loadRegister(Model model) {
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
        if (result.hasErrors()) {
            return "register";
        } else {
            user.setRoles("Sales");
            user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
            user.setPermissions("Access_All");
            String token = UUID.randomUUID().toString();
            user.setToken(new Token(token));

            repository.save(user);


            emailSenderService.sentSimpleEmail(
                    user.getEmail().trim(),
                    "Confirm your account",
                    "https://one-store-backend.herokuapp.com/confirm/account/"+token);

            String massage = "A verification code sent to <b>" + user.getEmail()
                    + "</b>. Please confirm your email address by clicking this link ";
            model.addAttribute("massage", massage);
            return "common/show-info";
        }
    }

    @RequestMapping("confirm/account/{token}")
    public String doConfirm(@PathVariable("token") String token){
        repository.activeUser(token);

        return "redirect:/login";
    }
}
