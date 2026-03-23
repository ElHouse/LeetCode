package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2368_Reachable_Nodes_With_RestrictionsTest {


    private final _2368_Reachable_Nodes_With_Restrictions reachableNodesWithRestrictions = new _2368_Reachable_Nodes_With_Restrictions();


    @Test
    public void test01() {
        int[][] array1 = {
                {0, 1},
                {1, 2},
                {3, 1},
                {4, 0},
                {0, 5},
                {5, 6}
        };

        assertEquals(4, reachableNodesWithRestrictions.reachableNodes(7, array1, new int[]{4, 5}));
    }

    @Test
    public void test02() {
        int[][] array1 = {
                {0, 1},
                {0, 2},
                {0, 5},
                {0, 4},
                {3, 2},
                {6, 5}
        };

        assertEquals(3, reachableNodesWithRestrictions.reachableNodes(7, array1, new int[]{4, 2, 1}));
    }

    @Test
    public void test03() {
        int[][] array1 = {
                {0, 1},
                {0, 2},
                {0, 5},
                {0, 4},
                {3, 2},
                {6, 5}
        };

        assertEquals(5, reachableNodesWithRestrictions.reachableNodes(7, array1, new int[]{4, 1}));
    }


    @Test
    public void test04() {
        int[][] array1 = {
                {0, 1},
                {0, 2},
                {0, 5},
                {0, 4},
                {3, 2},
                {6, 5}
        };

        assertEquals(1, reachableNodesWithRestrictions.reachableNodes(7, array1, new int[]{1, 2, 4, 5}));
    }


    @Test
    public void test05() {
        int[][] array1 = {
                {0, 1},
                {1, 2},
                {3, 1},
                {4, 0},
                {0, 5},
                {5, 6},
                {3, 6}
        };

        assertEquals(5, reachableNodesWithRestrictions.reachableNodes(8, array1, new int[]{4, 5}));
    }
}