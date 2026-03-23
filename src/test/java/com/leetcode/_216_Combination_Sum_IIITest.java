package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _216_Combination_Sum_IIITest {


    private final _216_Combination_Sum_III combinationSumIii = new _216_Combination_Sum_III();


    @Test
    public void test01() {
        assertEquals(List.of(List.of(1, 2, 4)), combinationSumIii.combinationSum3(3, 7));
    }

    @Test
    public void test02() {
        assertEquals(List.of(
                List.of(1, 2, 6),
                List.of(1, 3, 5),
                List.of(2, 3, 4)),
                combinationSumIii.combinationSum3(3, 9));
    }

    @Test
    public void test03() {
        assertEquals(List.of(), combinationSumIii.combinationSum3(4, 1));
    }

}