package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1493_Longest_Subarray_of_1s_After_Deleting_One_ElementTest {


    private final _1493_Longest_Subarray_of_1s_After_Deleting_One_Element longestSubarrayOf1sAfterDeletingOneElement = new _1493_Longest_Subarray_of_1s_After_Deleting_One_Element();


    @Test
    public void test01() {

        assertEquals(3, this.longestSubarrayOf1sAfterDeletingOneElement.longestSubarray(new int[]
                {1, 1, 0, 1}
        ));

    }

    @Test
    public void test02() {

        assertEquals(5, this.longestSubarrayOf1sAfterDeletingOneElement.longestSubarray(new int[]
                {0, 1, 1, 1, 0, 1, 1, 0, 1}
        ));

    }

    @Test
    public void test03() {

        assertEquals(2, this.longestSubarrayOf1sAfterDeletingOneElement.longestSubarray(new int[]
                {1, 1, 1}
        ));

    }

    @Test
    public void test04() {

        assertEquals(6, this.longestSubarrayOf1sAfterDeletingOneElement.longestSubarray(new int[]
                {0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1}
        ));

    }

}