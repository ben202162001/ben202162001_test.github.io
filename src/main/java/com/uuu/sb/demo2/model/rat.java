package com.uuu.sb.demo2.model;

import org.springframework.context.annotation.Bean;


public class rat {
    String name = "Jerry";
    String move = "跑";
    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name = name;
    }
    public String getMove(){

        return move;
    }
    public void setMove(String move){

        this.move = move;
    }
}
