package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _973_K_Closest_Points_to_OriginTest {

    private final _973_K_Closest_Points_to_Origin kClosestPointsToOrigin  = new _973_K_Closest_Points_to_Origin();

    @Test
    public void test01(){
        int[][] points = {{1,3},{-2,2}};

        assertArrayEquals(new int[][]{{-2,2}}, kClosestPointsToOrigin.kClosest(points, 1));
    }

    @Test
    public void test02(){
        int[][] points = {
                {3, 3},
                {5, -1},
                {-2, 4}};

        assertArrayEquals(new int[][]{{-2,4},{3,3}}, kClosestPointsToOrigin.kClosest(points, 2));
    }



}