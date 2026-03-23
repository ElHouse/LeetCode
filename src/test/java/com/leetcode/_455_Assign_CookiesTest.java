package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _455_Assign_CookiesTest {


    private final _455_Assign_Cookies assignCookies = new _455_Assign_Cookies();

    @Test
    public void test01(){
        assertEquals(1, assignCookies.findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
        assertEquals(2, assignCookies.findContentChildren(new int[]{1,2}, new int[]{1,2}));
        assertEquals(2, assignCookies.findContentChildren(new int[]{1,2}, new int[]{1,2}));

        assertEquals(0, assignCookies.findContentChildren(new int[]{1,2}, new int[]{}));
        assertEquals(1, assignCookies.findContentChildren(new int[]{6,6,6,1}, new int[]{5,5,5,5}));
        assertEquals(0, assignCookies.findContentChildren(new int[]{6,6,6,6}, new int[]{5,5,5,5}));

        assertEquals(1, assignCookies.findContentChildren(new int[]{1,2,3,4}, new int[]{3}));

    }
}