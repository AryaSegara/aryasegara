package com.tugas4.aryasegara.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tugas4.aryasegara.model.Food;

@Service
public class FoodService {
    public List <Food> getAllFood() {
        List<Food> foods = new ArrayList<>();
        foods.add(new Food(1, "Ayam Goreng", 20000L,"Besar"));
        foods.add(new Food(2, "Ayam Geprek", 18000L,"Sedang"));
        foods.add(new Food(3, "Kentang Goreng", 25000L,"Sedang"));
        foods.add(new Food(4, "Rendang", 25000L,"Besar"));
        return foods;
    }
}
