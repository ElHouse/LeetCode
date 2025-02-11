package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

class _77_CombinationsTest {

    _77_Combinations combinationsTest = new _77_Combinations();

    @Test
    public void case1() {


        List<List<Integer>> answer  = combinationsTest.combine(10, 4);
        for(List<Integer> l : answer) {
            System.out.println(l);
        }
    }

}