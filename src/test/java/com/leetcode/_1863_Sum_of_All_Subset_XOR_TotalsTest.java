package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1863_Sum_of_All_Subset_XOR_TotalsTest {
    _1863_Sum_of_All_Subset_XOR_Totals sumOfAllSubsetXorTotals = new _1863_Sum_of_All_Subset_XOR_Totals();


    @Test
    public void test01() {
        assertEquals(6, sumOfAllSubsetXorTotals.subsetXORSum(new int[]{1, 3}));
        assertEquals(28, sumOfAllSubsetXorTotals.subsetXORSum(new int[]{5, 1, 6}));
        assertEquals(480, sumOfAllSubsetXorTotals.subsetXORSum(new int[]{3,4,5,6,7,8}));
    }


}