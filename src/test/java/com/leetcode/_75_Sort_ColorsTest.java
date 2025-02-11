package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class _75_Sort_ColorsTest {

    private final _75_Sort_Colors sortColors = new _75_Sort_Colors();

    @Test
    public void test1() {
        int[] array = new int[]{2, 0, 2, 1, 1, 0};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, array);
    }

    @Test
    public void test2() {
        int[] array = new int[]{2, 0, 1};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{0, 1, 2}, array);
    }


    @Test
    public void test3() {
        int[] array = new int[]{2};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{2}, array);
    }


    @Test
    public void test4() {
        int[] array = new int[]{1};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{1}, array);
    }


    @Test
    public void test5() {
        int[] array = new int[]{0};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{0}, array);
    }


    @Test
    public void test6() {
        int[] array = new int[]{2, 1, 1};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{1, 1, 2}, array);
    }

    @Test
    public void test7() {
        int[] array = new int[]{2, 2, 2};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{2, 2, 2}, array);
    }

    @Test
    public void test8() {
        int[] array = new int[]{1, 1, 1};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{1, 1, 1}, array);
    }

    @Test
    public void test9() {
        int[] array = new int[]{0, 0, 0};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{0, 0, 0}, array);
    }


    @Test
    public void test10() {
        int[] expected = new int[]{2, 0, 2, 1, 1, 0, 2, 1, 1, 0, 2, 1, 1, 2, 0, 2, 1, 1, 0, 2, 1, 1
                , 0, 2, 1, 1, 0, 2, 0, 2, 1, 1, 0, 2, 1, 1, 0, 2, 1, 1, 0, 0, 2, 1, 1, 0, 2, 1, 1, 0, 2, 1, 1, 0};

        int[] array = new int[]{2, 0, 2, 1, 1, 0, 2, 1, 1, 0, 2, 1, 1, 2, 0, 2, 1, 1, 0, 2, 1, 1
                , 0, 2, 1, 1, 0, 2, 0, 2, 1, 1, 0, 2, 1, 1, 0, 2, 1, 1, 0, 0, 2, 1, 1, 0, 2, 1, 1, 0, 2, 1, 1, 0};
        sortColors.sortColors(array);
        Arrays.sort(expected);
        assertArrayEquals(expected, array);
    }

    @Test
    public void test11() {
        int[] array = new int[]{0, 1};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{0, 1}, array);
    }

    @Test
    public void test12() {
        int[] array = new int[]{1, 2};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{1, 2}, array);
    }

    @Test
    public void test13() {
        int[] array = new int[]{2, 2, 2, 1, 2};
        sortColors.sortColors(array);
        assertArrayEquals(new int[]{1, 2, 2, 2, 2}, array);
    }


}