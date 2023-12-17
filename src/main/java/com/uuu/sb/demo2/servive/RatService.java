package com.uuu.sb.demo2.servive;

import com.uuu.sb.demo2.model.rat;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Service
public interface RatService {
    public String rat_run();
    rat get_rat_move ();
    rat update_rat_move (String move);


}
