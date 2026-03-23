package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1615_Maximal_Network_RankTest {

    private final _1615_Maximal_Network_Rank maximalNetworkRank = new _1615_Maximal_Network_Rank();


    @Test
    public void test01() {
        int[][] graph1 = {
                {0, 1},
                {0, 3},
                {1, 2},
                {1, 3}
        };

        assertEquals(4, maximalNetworkRank.maximalNetworkRank(4, graph1));
    }


    @Test
    public void test02() {
        int[][] graph2 = {
                {0, 1},
                {0, 3},
                {1, 2},
                {1, 3},
                {2, 3},
                {2, 4}
        };

        assertEquals(5, maximalNetworkRank.maximalNetworkRank(5, graph2));
    }


    @Test
    public void test03() {
        int[][] graph3 = {
                {0, 1},
                {1, 2},
                {2, 3},
                {2, 4},
                {5, 6},
                {5, 7}
        };

        assertEquals(5, maximalNetworkRank.maximalNetworkRank(8, graph3));
    }

    @Test
    public void test04() {
        int[][] graph3 = new int[0][];

        assertEquals(0, maximalNetworkRank.maximalNetworkRank(8, graph3));
    }

    @Test
    public void test05() {
        int[][] graph3 = {
                {1, 0}
        };

        assertEquals(1, maximalNetworkRank.maximalNetworkRank(2, graph3));
    }

}