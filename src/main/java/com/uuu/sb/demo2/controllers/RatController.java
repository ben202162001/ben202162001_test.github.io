package com.uuu.sb.demo2.controllers;
import com.uuu.sb.demo2.servive.RatService;
import com.uuu.sb.demo2.servive.RatServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class RatController {
    @RequestMapping("/rat")
    public String rat() throws FileNotFoundException {
        String result ;
        RatServiceImp RatService = new RatServiceImp();
        result= RatService.rat_run();
        return result;

    }
}
