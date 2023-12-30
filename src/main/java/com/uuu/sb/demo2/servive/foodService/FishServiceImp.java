package com.uuu.sb.demo2.servive.foodService;

import com.uuu.sb.demo2.model.food.fish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FishServiceImp implements FishService{
    @Autowired
    fish fish;
    @Override
    public String get_fish_name() {
       return fish.getName();
    }
}
