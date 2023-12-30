package com.uuu.sb.demo2.servive;

import com.uuu.sb.demo2.model.cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatServiceImp implements CatService{

    @Autowired
    RatService RatService;
    @Autowired
    com.uuu.sb.demo2.servive.foodService.FishService FishService;

    @Override
    public String get_rat_move_from_cat(){
        String get_rat_move_from_cat = RatService.get_rat_move().getMove();
        return get_rat_move_from_cat;
    }

    @Override
    public String get_cat_food() {
        String get_cat_food = FishService.get_fish_name();
        return get_cat_food;
    }

    @Override
    public String cat_run() {
        return null;
    }

    @Override
    public cat get_cat_move() {
        cat cat = new cat();
        return cat;
    }

    @Override
    public cat update_cat_move(String move) {
        cat cat = new cat();
        return cat;
    }
}
