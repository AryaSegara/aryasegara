package com.tugas4.aryasegara.service;

import com.tugas4.aryasegara.model.Chef;
import com.tugas4.aryasegara.model.ChefRestaurant;
import com.tugas4.aryasegara.model.Food;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChefRestraurantService {

  @Autowired
  private FoodService foodService;

  @Autowired
  private ChefService chefService;

  public List<ChefRestaurant> getChefRestaurants() {
    List<ChefRestaurant> chefRestaurants = new ArrayList<>();
    List<Food> foods = foodService.getAllFood();
    List<Chef> chefs = chefService.getAllChef();

    for (int i = 0; i < foods.size(); i++) {
      Food food = foods.get(i);
      Chef chef = chefs.get(i % chefs.size());
      chefRestaurants.add(new ChefRestaurant(food, chef));
    }
    return chefRestaurants;
  }
}
