package com.tugas4.aryasegara.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tugas4.aryasegara.model.ChefRestaurant;
import com.tugas4.aryasegara.service.ChefRestraurantService;

@Controller
public class ChefRestaurantController {
    
    @Autowired
    private ChefRestraurantService chefRestraurantService;

    @GetMapping("/chef-restaurant")
    public String getChefRestaurant(Model model){
        List<ChefRestaurant> chefRestaurants = chefRestraurantService.getChefRestaurants();

        model.addAttribute("chefRestaurant",chefRestaurants);
        return "chef-restaurant";
    }
}
