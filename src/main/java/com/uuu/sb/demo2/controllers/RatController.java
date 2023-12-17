package com.uuu.sb.demo2.controllers;
import com.uuu.sb.demo2.model.rat;
import com.uuu.sb.demo2.servive.RatService;
import com.uuu.sb.demo2.servive.RatServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class RatController {
    @RequestMapping("/rat_run")
    public String rat_run() {
        RatService RatService = new RatServiceImp();
        return RatService.rat_run();

    }
    @RequestMapping("/get_rat_move")
    public String get_rat_move() {
        RatService RatService = new RatServiceImp();
        rat rat = RatService.get_rat_move();
        return (rat.getMove());
    }
    @RequestMapping("/update_rat_move")
    public String update_rat_move() {
        RatService RatService = new RatServiceImp();
        rat rat = RatService.update_rat_move("飛");
        return (rat.getMove());

    }
}
