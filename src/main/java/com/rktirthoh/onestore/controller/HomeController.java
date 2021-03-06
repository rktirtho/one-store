package com.rktirthoh.onestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHome() {
        return "redirect:login";
    }

    @RequestMapping("dashboard")
    public String getHomeDesk(Model  model)
    {
        model.addAttribute("firstName", "Rejaul");
        model.addAttribute("lastName", "Karim");
        model.addAttribute("role", "Admin");
        return "dashboard/home";
    }
}
