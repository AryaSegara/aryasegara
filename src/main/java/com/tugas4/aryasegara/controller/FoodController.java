package com.tugas4.aryasegara.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tugas4.aryasegara.model.Food;
import com.tugas4.aryasegara.service.FoodService;

@Controller
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/food")
    public String listFood(Model model){
        List <Food> foods = foodService.getAllFood();
        model.addAttribute("foods",foods);
        return "food";
    }
    
}
