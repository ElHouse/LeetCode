package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _747_Largest_Number_At_Least_Twice_of_OthersTest {

    _747_Largest_Number_At_Least_Twice_of_Others largestNumberAtLeastTwiceOfOthers = new _747_Largest_Number_At_Least_Twice_of_Others();

    @Test
    public void case2() {

        System.out.println("...............case 2");

        int[] nums = {1, 2, 3, 4};

        assertEquals(-1, largestNumberAtLeastTwiceOfOthers.dominantIndex(nums));
    }


    @Test
    public void case3() {

        System.out.println("...............case 3");

        int[] nums = {3, 6, 1, 0, 6, 31};

        assertEquals(5, largestNumberAtLeastTwiceOfOthers.dominantIndex(nums));
    }


    @Test
    public void case4() {

        System.out.println("...............case 4");

        int[] nums = {12, 12, 12, 6};

        assertEquals(-1, largestNumberAtLeastTwiceOfOthers.dominantIndex(nums));
    }


    @Test
    public void case5() {

        System.out.println("...............case 5");

        int[] nums = {16, 8, 1};

        assertEquals(0, largestNumberAtLeastTwiceOfOthers.dominantIndex(nums));
    }

    @Test
    public void case6() {

        System.out.println("...............case 6");

        int[] nums = {16, 9, 1};

        assertEquals(-1, largestNumberAtLeastTwiceOfOthers.dominantIndex(nums));
    }

    @Test
    public void case7() {

        System.out.println("...............case 6");

        int[] nums = {16};

        assertEquals(0, largestNumberAtLeastTwiceOfOthers.dominantIndex(nums));
    }

}