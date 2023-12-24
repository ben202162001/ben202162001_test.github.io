package com.uuu.sb.demo2.dao;

import com.uuu.sb.demo2.model.rat;
import org.springframework.stereotype.Component;

@Component
public class RatDaoImp implements RatDao{
    @Override
    public rat get_rat_move_dao() {

        //select
        rat rat=new rat();
        return rat;
    }

    @Override
    public rat update_rat_move_dao(String move) {
        //update
        rat rat=new rat();
        rat.setMove(move);
        return rat;
    }
}
