package com.rktirthoh.onestore.controller;

import com.rktirthoh.onestore.dao.CategoryRepository;
import com.rktirthoh.onestore.entity.products.Category;
import com.rktirthoh.onestore.entity.products.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("dashboard")
public class EcomMasterController {

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("category")
    public String showCategory(Model model) {

        List<Category> categories = categoryRepository.findAll();
        model.addAttribute("categories", categories);
        return "dashboard/ecom-master/category";
    }

    @RequestMapping("category-registration")
    public String showCategoryRegistrationForm(@ModelAttribute Category category, Model model) {
        //binding property
        model.addAttribute("category", category);
        return "dashboard/ecom-master/register-category";
    }


    @PostMapping("save-category")
    public String saveCategory(@ModelAttribute("category") Category category, Model model) {
        categoryRepository.save(category);
        return "redirect:/dashboard/category";
    }

}
