package com.uuu.sb.demo2.controllers;

import com.uuu.sb.demo2.model.cat;
import com.uuu.sb.demo2.servive.CatService;
import com.uuu.sb.demo2.servive.CatServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @Autowired
    CatService CatService;
    @RequestMapping("/get_cat_move")
    public String get_cat_move() {
        cat cat = CatService.get_cat_move();
        return (cat.getMove());
    }
    @RequestMapping("/get_rat_move_from_cat")
    public String get_rat_move_from_cat() {
        String get_rat_move_from_cat = CatService.get_rat_move_from_cat();
        return (get_rat_move_from_cat);
    }
    @RequestMapping("/get_cat_food")
    public String get_cat_food() {
        String get_cat_food = CatService.get_cat_food();
        return (get_cat_food);
    }
}
