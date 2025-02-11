package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _933_Number_of_Recent_CallsTest {

    @Test
    public void test01() {

        _933_Number_of_Recent_Calls numberOfRecentCalls = new _933_Number_of_Recent_Calls();
        assertEquals(1, numberOfRecentCalls.ping(1));
        assertEquals(2, numberOfRecentCalls.ping(100));
        assertEquals(3, numberOfRecentCalls.ping(3001));
        assertEquals(3, numberOfRecentCalls.ping(3002));
        assertEquals(1, numberOfRecentCalls.ping(15000));

    }

    @Test
    public void test02() {
        _933_Number_of_Recent_Calls numberOfRecentCalls = new _933_Number_of_Recent_Calls();
        for (int i = 1; i < 100; i++) {
            assertEquals(i, numberOfRecentCalls.ping(1));
        }
    }

}