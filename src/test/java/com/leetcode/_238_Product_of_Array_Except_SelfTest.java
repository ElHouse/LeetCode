package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class _238_Product_of_Array_Except_SelfTest {

    private final _238_Product_of_Array_Except_Self productOfArrayExceptSelf = new _238_Product_of_Array_Except_Self();

    @Test
    public void test01() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, productOfArrayExceptSelf.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[]{1}, productOfArrayExceptSelf.productExceptSelf(new int[]{0}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[]{0, 0, 0, 0}, productOfArrayExceptSelf.productExceptSelf(new int[]{0, 0, 0, 4}));
    }

    @Test
    public void test05() {

        assertArrayEquals(new int[]{40320, 20160, 13440, 10080, 8064, 6720, 5760, 5040}, productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, productOfArrayExceptSelf.productExceptSelf(new int[]{0, 0, 0, 0, 0}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, productOfArrayExceptSelf.productExceptSelf(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void test08() {

        assertArrayEquals(new int[]{5040, 5760, 6720, 8064, 10080, 13440, 20160, 40320},
                productOfArrayExceptSelf.productExceptSelf(new int[]{8, 7, 6, 5, 4, 3, 2, 1}));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[]{0, 0, 0, 0}, productOfArrayExceptSelf.productExceptSelf(new int[]{0, 0, 4, 1}));
    }

    @Test
    public void test10() {
        assertArrayEquals(new int[]{6, 8, 12, 24}, productOfArrayExceptSelf.productExceptSelf(new int[]{4, 3, 2, 1}));
    }
    @Test
    public void test11() {
        assertArrayEquals(new int[]{1}, productOfArrayExceptSelf.productExceptSelf(new int[]{3}));
    }


}