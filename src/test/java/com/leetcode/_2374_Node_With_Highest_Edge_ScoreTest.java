package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _2374_Node_With_Highest_Edge_ScoreTest {

    _2374_Node_With_Highest_Edge_Score nodeWithHighestEdgeScore = new _2374_Node_With_Highest_Edge_Score();


    @Test
    public void test01() {
        assertEquals(7, nodeWithHighestEdgeScore.edgeScore(new int[]{1, 0, 0, 0, 0, 7, 7, 5}));
        assertEquals(0, nodeWithHighestEdgeScore.edgeScore(new int[]{2, 0, 0, 2}));

    }

    @Test
    public void test02() {

        int[] input = new int[66001];

        Arrays.fill(input, 1);
        input[1] = 0;

        assertEquals(1, nodeWithHighestEdgeScore.edgeScore(input));
    }

}