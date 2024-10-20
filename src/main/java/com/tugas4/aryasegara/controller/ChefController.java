package com.tugas4.aryasegara.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tugas4.aryasegara.model.Chef;
import com.tugas4.aryasegara.service.ChefService;

@Controller
public class ChefController {
    @Autowired
    private ChefService chefService;

    @GetMapping("/chef")
    public String listChef (Model model) {
        List <Chef> chefs = chefService.getAllChef();
        model.addAttribute("chefs",chefs);
        return "chef";
    }
}
