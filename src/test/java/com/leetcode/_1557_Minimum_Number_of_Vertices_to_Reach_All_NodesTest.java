package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _1557_Minimum_Number_of_Vertices_to_Reach_All_NodesTest {

    private final _1557_Minimum_Number_of_Vertices_to_Reach_All_Nodes minimumNumberOfVerticesToReachAllNodes = new _1557_Minimum_Number_of_Vertices_to_Reach_All_Nodes();


    @Test
    public void test01() {
        List<List<Integer>> list1 = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(0, 2),
                Arrays.asList(2, 5),
                Arrays.asList(3, 4),
                Arrays.asList(4, 2)
        );


        assertEquals(List.of(0,3), minimumNumberOfVerticesToReachAllNodes.findSmallestSetOfVertices(6,list1));

    }

    @Test
    public void test02() {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(2, 1),
                Arrays.asList(3, 1),
                Arrays.asList(1, 4),
                Arrays.asList(2, 4)
        );

        assertEquals(List.of(0,2,3), minimumNumberOfVerticesToReachAllNodes.findSmallestSetOfVertices(5,list));



    }


}