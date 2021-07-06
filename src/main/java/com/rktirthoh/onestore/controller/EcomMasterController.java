package com.rktirthoh.onestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dashboard")
public class EcomMasterController {
    @RequestMapping("category")
    public String showCategory(){
        return "dashboard/ecom-master/category";
    }
}
