package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _323_Number_of_Connected_Components_in_an_Undirected_GraphTest {


    private final _323_Number_of_Connected_Components_in_an_Undirected_Graph numberOfConnectedComponentsInAnUndirectedGraph = new _323_Number_of_Connected_Components_in_an_Undirected_Graph();


    @Test
    public void test01() {

        int[][] array1 = {
                {0, 1},
                {1, 2},
                {3, 4}
        };

        assertEquals(2, numberOfConnectedComponentsInAnUndirectedGraph.countComponents(5, array1));
    }


    @Test
    public void test02() {

        int[][] array1 = {
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 4}
        };


        assertEquals(1, numberOfConnectedComponentsInAnUndirectedGraph.countComponents(5, array1));
    }

    @Test
    public void test03() {

        int[][] array1 = {
                {1, 0}
        };

        assertEquals(1, numberOfConnectedComponentsInAnUndirectedGraph.countComponents(2, array1));
    }

    @Test
    public void test04() {

        int[][] array1 = {
                {2, 3},
                {1, 2},
                {1, 3}
        };


        assertEquals(2, numberOfConnectedComponentsInAnUndirectedGraph.countComponents(4, array1));
    }

    @Test
    public void test05() {

        int[][] array1 = {
                {1, 0},
                {2, 0}
        };


        assertEquals(1, numberOfConnectedComponentsInAnUndirectedGraph.countComponents(3, array1));
    }



}