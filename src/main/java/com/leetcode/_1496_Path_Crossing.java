package com.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _1496_Path_Crossing {


    public boolean isPathCrossing(String path) {

        Set<String> set = new HashSet<>();
        String origin = "00";
        set.add(origin);

        for (int i = 0; i < path.length(); i++) {

            char x = origin.charAt(0);
            char y = origin.charAt(1);

            char move = path.charAt(i);
            if (move == 'N') {
                x += 1;
            } else if (move == 'S') {
                x -= 1;
            } else if (move == 'W') {
                y -= 1;
            } else {
                y += 1;
            }

            origin = String.valueOf(x) + String.valueOf(y);

            if(set.contains(origin)){
                return true;
            }

            set.add(origin);
        }


        return false;
    }


}
