package com.tugas4.aryasegara.service;

import java.util.List;
import java.util.ArrayList;


import org.springframework.stereotype.Service;

import com.tugas4.aryasegara.model.Chef;

@Service
public class ChefService {
    public List <Chef> getAllChef(){
        List<Chef> chefs = new ArrayList<>();
        chefs.add(new Chef(1,"Arya","Pekanbaru"));
        chefs.add(new Chef(2,"Fady","Sipirok"));
        chefs.add(new Chef(3,"Ajang","KBB"));
        chefs.add(new Chef(4,"Teguh","Sibolga"));

        return chefs;
    }
}
