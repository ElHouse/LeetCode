package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2285_Maximum_Total_Importance_of_RoadsTest {


    private _2285_Maximum_Total_Importance_of_Roads maximumTotalImportanceOfRoads = new _2285_Maximum_Total_Importance_of_Roads();


    @Test
    public void test01() {
        int[][] roads = {
                {0, 1},
                {1, 2},
                {2, 3},
                {0, 2},
                {1, 3},
                {2, 4}
        };

        assertEquals(43, maximumTotalImportanceOfRoads.maximumImportance(5, roads));
    }

    @Test
    public void test02() {
        int[][] roads = {
                {0, 3},
                {2, 4},
                {1, 3}
        };

        assertEquals(20, maximumTotalImportanceOfRoads.maximumImportance(5, roads));
    }

    @Test
    public void test03() {
        int[][] roads = {
                {0, 1},
                {2, 3}
        };

        assertEquals(10, maximumTotalImportanceOfRoads.maximumImportance(4, roads));
    }


    @Test
    public void test04() {
        int[][] roads = {
                {0, 1}
        };

        assertEquals(3, maximumTotalImportanceOfRoads.maximumImportance(2, roads));
    }

    @Test
    public void test05() {

        assertEquals(0, maximumTotalImportanceOfRoads.maximumImportance(2, null));
    }


}