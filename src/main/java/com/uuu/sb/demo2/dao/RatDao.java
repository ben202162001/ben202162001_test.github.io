package com.uuu.sb.demo2.dao;
import com.uuu.sb.demo2.model.rat;
import org.springframework.stereotype.Service;

@Service
public interface RatDao {
    rat get_rat_move_dao ();
    rat update_rat_move_dao (String move);

}
