package com.uuu.sb.demo2.model.food;

import org.springframework.stereotype.Service;

@Service
public class fish {
    String name = "魚";
    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name = name;
    }
}
