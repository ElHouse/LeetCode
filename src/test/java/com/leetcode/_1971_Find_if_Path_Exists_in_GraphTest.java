package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1971_Find_if_Path_Exists_in_GraphTest {


    private final _1971_Find_if_Path_Exists_in_Graph findIfPathExistsInGraph = new _1971_Find_if_Path_Exists_in_Graph();



    @Test
    public void test00() {

        int[][] coordinates = {
                {4, 3}, {1, 4}, {4, 8}, {1, 7}, {6, 4},
                {4, 2}, {7, 4}, {4, 0}, {0, 9}, {5, 4}
        };


        assertTrue(findIfPathExistsInGraph.validPath(3, coordinates, 5, 9));
    }

    @Test
    public void test01() {

        int[][] array1 = {
                {0, 1},
                {1, 2},
                {2, 0}
        };


        assertTrue(findIfPathExistsInGraph.validPath(3, array1, 0, 2));
    }

    @Test
    public void test02() {

        int[][] array2 = {
                {0, 1},
                {0, 2},
                {3, 5},
                {5, 4},
                {4, 3}
        };

        assertFalse(findIfPathExistsInGraph.validPath(6, array2, 0, 5));
    }

}