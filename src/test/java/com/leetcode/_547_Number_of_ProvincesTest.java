package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _547_Number_of_ProvincesTest {

    private final _547_Number_of_Provinces numberOfProvinces = new _547_Number_of_Provinces();

    @Test
    public void test01() {
        assertEquals(2, numberOfProvinces.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
    }

    @Test
    public void test02() {
        assertEquals(3, numberOfProvinces.findCircleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }

    @Test
    public void test03() {
        assertEquals(1, numberOfProvinces.findCircleNum(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}));
    }

    @Test
    public void test04() {
        assertEquals(2, numberOfProvinces.findCircleNum(new int[][]{{1, 0, 1}, {0, 1, 0}, {1, 0, 1}}));
    }

}