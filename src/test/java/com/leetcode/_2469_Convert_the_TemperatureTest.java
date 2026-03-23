package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2469_Convert_the_TemperatureTest {
    _2469_Convert_the_Temperature convertTheTemperature = new _2469_Convert_the_Temperature();


    @Test
    public void test01() {
        assertArrayEquals(new double[]{309.65000,97.70000}, convertTheTemperature.convertTemperature(36.50));
        assertArrayEquals(new double[]{395.26000,251.79800}, convertTheTemperature.convertTemperature(122.11));
    }
}