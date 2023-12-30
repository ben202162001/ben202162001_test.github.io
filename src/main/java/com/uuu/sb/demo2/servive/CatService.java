package com.uuu.sb.demo2.servive;

import com.uuu.sb.demo2.model.cat;
import com.uuu.sb.demo2.model.rat;
import org.springframework.stereotype.Service;

@Service
public interface CatService {
    String cat_run();
    cat get_cat_move ();
    cat update_cat_move (String move);
    String get_rat_move_from_cat();
    String get_cat_food();
}
