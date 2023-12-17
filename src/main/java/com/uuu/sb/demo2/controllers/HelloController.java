package com.uuu.sb.demo2.controllers;

import com.uuu.sb.demo2.servive.RatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "greeting";
    }

}
