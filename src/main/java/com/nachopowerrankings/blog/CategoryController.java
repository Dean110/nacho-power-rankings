package com.nachopowerrankings.blog;

import org.springframework.ui.Model;

public class CategoryController {
    private CategoryRepository categoryRepo;

    public CategoryController(CategoryRepository categoryRepo) {

        this.categoryRepo = categoryRepo;
    }

    public String displayAllCategories(Model model) {
        model.addAttribute("categories",categoryRepo.findAll());
        return null;
    }

//    public String displayAllCategories(Model model){
//        model.addAttribute("categories", categoryRepo.findAll());
//        return "all-categories-template";
//    }
}
