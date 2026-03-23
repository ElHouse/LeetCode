package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _797_All_Paths_From_Source_to_TargetTest {


    private final _797_All_Paths_From_Source_to_Target allPathsFromSourceToTarget = new _797_All_Paths_From_Source_to_Target();


    @Test
    public void test01() {

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(0, 1, 3));
        expected.add(List.of(0, 2, 3));

        int[][] graph = {
                {1, 2},
                {3},
                {3},
                {}
        };


        assertEquals(expected, allPathsFromSourceToTarget.allPathsSourceTarget(graph));
    }

    @Test
    public void test02() {

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 4),
                Arrays.asList(0, 3, 4),
                Arrays.asList(0, 1, 3, 4),
                Arrays.asList(0, 1, 2, 3, 4),
                Arrays.asList(0, 1, 4)
        );

        int[][] graph = {
                {4, 3, 1},
                {3, 2, 4},
                {3},
                {4},
                {}
        };


        assertEquals(expected, allPathsFromSourceToTarget.allPathsSourceTarget(graph));
    }

    @Test
    public void test03() {

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 4),
                Arrays.asList(0, 3, 4),
                Arrays.asList(0, 1, 3, 4),
                Arrays.asList(0, 1, 4)
        );

        int[][] graph = {
                {4, 3, 1},
                {3, 2, 4},
                {},
                {4},
                {}
        };


        assertEquals(expected, allPathsFromSourceToTarget.allPathsSourceTarget(graph));
    }



}