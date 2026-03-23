package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _38_Count_Number_PairsTest {


    _38_Count_Number_Pairs countNumberPairs = new _38_Count_Number_Pairs();

    @Test
    public void test00() {
        assertEquals(8, countNumberPairs.countAffordablePairs(List.of(1, 2, 3, 4, 5), 7));

    }

    @Test
    public void test01() {
        assertEquals(8, countNumberPairs.countAffordablePairs(List.of(1, 2, 3, 4, 5), 7));
        assertEquals(0, countNumberPairs.countAffordablePairs(List.of(500), 7));
        assertEquals(0, countNumberPairs.countAffordablePairs(List.of(1, 5, 5), 5));

        assertEquals(0, countNumberPairs.countAffordablePairs(List.of(1, 2, 3, 4, 5), 1));
        assertEquals(1, countNumberPairs.countAffordablePairs(List.of(1, 2, 3, 4, 5), 3));

        assertEquals(8, countNumberPairs.countAffordablePairs(List.of(1, 2, 3, 4, 5), 7));
        assertEquals(0, countNumberPairs.countAffordablePairs(List.of(5, 6, 7, 8), 4));
        assertEquals(6, countNumberPairs.countAffordablePairs(List.of(1, 1, 1, 1), 2));
        assertEquals(4, countNumberPairs.countAffordablePairs(List.of(1, 2, 2, 3), 4));
        assertEquals(9, countNumberPairs.countAffordablePairs(List.of(1, 2, 2, 3, 3), 5));
        assertEquals(1, countNumberPairs.countAffordablePairs(List.of(2, 3), 5));
        assertEquals(0, countNumberPairs.countAffordablePairs(List.of(2, 3), 4));
        assertEquals(15, countNumberPairs.countAffordablePairs(List.of(1, 1, 1, 1, 1, 1), 2));
        assertEquals(14, countNumberPairs.countAffordablePairs(List.of(1, 2, 3, 4, 5, 6), 10));
        assertEquals(0, countNumberPairs.countAffordablePairs(List.of(), 5));

    }

}