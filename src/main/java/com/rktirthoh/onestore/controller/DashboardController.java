package com.rktirthoh.onestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dashboard")
public class DashboardController {
    @GetMapping("products")
    public String showAllProduct(){
        return "dashboard/products";
    }


    @GetMapping("orders")
    public String showOrders(){
        return "dashboard/products";
    }

    @GetMapping("customers")
    public String showcurtomers(){
        return "dashboard/products";
    }

    @GetMapping("inventory")
    public String showInvenroty(){
        return "dashboard/inventory";
    }

}
