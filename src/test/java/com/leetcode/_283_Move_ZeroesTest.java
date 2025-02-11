package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class _283_Move_ZeroesTest {

    private final _283_Move_Zeroes moveZeroes = new _283_Move_Zeroes();

    @Test
    public void test01() {
        int[] array = new int[]{0, 1, 0, 213, 12};
        moveZeroes.moveZeroes(array);
        assertArrayEquals(new int[]{1, 213, 12, 0, 0}, array);
    }


    @Test
    public void test02() {
        int[] array = new int[]{1, 1, 3, 12};
        moveZeroes.moveZeroes(array);
        assertArrayEquals(new int[]{1, 1, 3, 12}, array);
    }

    @Test
    public void test03() {
        int[] array = new int[]{0, 0, 0, 0};
        moveZeroes.moveZeroes(array);
        assertArrayEquals(new int[]{0, 0, 0, 0}, array);
    }

}