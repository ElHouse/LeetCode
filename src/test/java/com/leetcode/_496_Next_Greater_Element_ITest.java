package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _496_Next_Greater_Element_ITest {


    private final _496_Next_Greater_Element_I nextGreaterElementI = new _496_Next_Greater_Element_I();

    @Test
    public void test01() {
        int[] expected = {-1, 3, -1};
        int[] result = nextGreaterElementI.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        System.out.println(Arrays.toString(result));
        assertArrayEquals(expected, result);
    }


    @Test
    public void test02() {
        int[] expected = {3, -1};
        int[] result = nextGreaterElementI.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(result));

        assertArrayEquals(expected, result);
    }



    @Test
    public void test03() {
        int[] expected = {50, 3, 50 };
        int[] result = nextGreaterElementI.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2,50});
        System.out.println(Arrays.toString(result));
        assertArrayEquals(expected, result);
    }

}