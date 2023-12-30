package com.uuu.sb.demo2.dao;

import com.uuu.sb.demo2.model.rat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class RatDaoImp implements RatDao{


    @Override
    public rat get_rat_move_dao() {
        rat rat =new rat();
        //select
        return rat;
    }

    @Override
    public rat update_rat_move_dao(String move) {
        rat rat =new rat();
        //update
        rat.setMove(move);
        //select
        return rat;
    }
}
