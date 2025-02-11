package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _561_Array_Partition_ITest {

    _561_Array_Partition_I arrayPartitionI = new _561_Array_Partition_I();

    @Test
    public void case0() {

        assertEquals(0, arrayPartitionI.arrayPairSum(null));
    }


    @Test
    public void case1() {

        int[] nums = new int[2];

        assertEquals(0, arrayPartitionI.arrayPairSum(nums));
    }


    @Test
    public void case2() {

        int[] nums = {1, 4, 3, 2};

        assertEquals(4, arrayPartitionI.arrayPairSum(nums));
    }


    @Test
    public void case3() {

        int[] nums = {1, 4, 3, 2, 654, 3121, 76543, 21};

        assertEquals(3146, arrayPartitionI.arrayPairSum(nums));
    }


    @Test
    public void case4() {

        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};

        assertEquals(4, arrayPartitionI.arrayPairSum(nums));
    }

    @Test
    public void case5() {
        int[] nums = {7, 3, 1, 0, 0, 6};


        assertEquals(7, arrayPartitionI.arrayPairSum(nums));
    }

    @Test
    public void case6() {
        int[] nums = {1, 1, 2, 2, 4, 4, 8, 8, 11, 11};


        assertEquals(26, arrayPartitionI.arrayPairSum(nums));
    }
}