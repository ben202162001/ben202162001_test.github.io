package com.uuu.sb.demo2.servive;
import com.uuu.sb.demo2.model.rat;
import org.springframework.stereotype.Service;

@Service
public interface RatService {
    String rat_run();
    rat get_rat_move ();
    rat update_rat_move (String move);
}
