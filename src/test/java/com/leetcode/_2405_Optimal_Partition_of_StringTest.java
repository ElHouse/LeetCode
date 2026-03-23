package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2405_Optimal_Partition_of_StringTest {


    _2405_Optimal_Partition_of_String optimalPartitionOfString = new _2405_Optimal_Partition_of_String();

    @Test
    public void test01(){

        assertEquals(4, optimalPartitionOfString.partitionString("abacaba"));
        assertEquals(6, optimalPartitionOfString.partitionString("ssssss"));
        assertEquals(1, optimalPartitionOfString.partitionString("a"));
        assertEquals(1, optimalPartitionOfString.partitionString("ab"));
        assertEquals(2, optimalPartitionOfString.partitionString("aba"));

        assertEquals(4, optimalPartitionOfString.partitionString("hdklqkcssgxlvehva"));

    }

}