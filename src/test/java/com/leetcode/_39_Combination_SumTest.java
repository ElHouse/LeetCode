package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

class _39_Combination_SumTest {

    _39_Combination_Sum combination_sum = new _39_Combination_Sum();


    @Test
    public void case1() {

        int[] candidates = {2, 3, 5};
        int target = 8;

        List<List<Integer>> answer = combination_sum.combinationSum(candidates, target);

        for (List<Integer> l : answer) {
            System.out.println(l);
        }

    }


    @Test
    public void case2() {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> answer = combination_sum.combinationSum(candidates, target);

        for (List<Integer> l : answer) {
            System.out.println(l);
        }

    }

    //	@Test
    public void case3() {

        System.out.println("########## case 3");
        int[] candidates = {1, 2, 3, 4, 5, 6};
        int target = 12;

        List<List<Integer>> answer = combination_sum.combinationSum(candidates, target);

        for (List<Integer> l : answer) {
            System.out.println(l);
        }

    }

    @Test
    public void case4() {

        System.out.println("########## case4");
        int[] candidates = {1, 2};
        int target = 4;

        List<List<Integer>> answer = combination_sum.combinationSum(candidates, target);

        for (List<Integer> l : answer) {
            System.out.println(l);
        }

    }

}