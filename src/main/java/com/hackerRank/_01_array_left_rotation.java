package com.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class _01_array_left_rotation {


    public List<Integer> rotLeft(List<Integer> a, int d) {

        List<Integer> response = new ArrayList<>();
        if (d == 0) return a;

        int times = d > a.size() ? d % a.size() : d;
        System.out.println(times);
        for (int i = times; i < a.size(); i++) {
            response.add(a.get(i));
        }

        for (int i = 0; i < times; i++) {
            response.add(a.get(i));
        }

        return response;
    }
}
