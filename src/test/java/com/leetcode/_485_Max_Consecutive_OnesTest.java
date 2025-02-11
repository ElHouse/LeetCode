package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _485_Max_Consecutive_OnesTest {


    _485_Max_Consecutive_Ones maxConsecutiveOnes = new _485_Max_Consecutive_Ones();

    @Test
    public void case1() {
        int[] nums = {1, 1, 0, 1, 1, 1};

        assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));

    }

    @Test
    public void case2() {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1};

        assertEquals(4, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));

    }

    @Test
    public void case3() {
        int[] nums = {0};

        assertEquals(0, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));

    }

    @Test
    public void case4() {
        int[] nums = {1, 1, 1, 1, 1, 1};

        assertEquals(6, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));

    }

}