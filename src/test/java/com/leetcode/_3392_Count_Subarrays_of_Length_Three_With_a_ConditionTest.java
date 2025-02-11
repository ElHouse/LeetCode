package com.leetcode;

import com.leetcode._3392_Count_Subarrays_of_Length_Three_With_a_Condition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3392_Count_Subarrays_of_Length_Three_With_a_ConditionTest {

    _3392_Count_Subarrays_of_Length_Three_With_a_Condition countSubarraysOfLengthThreeWithACondition = new _3392_Count_Subarrays_of_Length_Three_With_a_Condition();

    @Test
    public void test1() {
        assertEquals(1, countSubarraysOfLengthThreeWithACondition.countSubarrays(new int[]{7, 8, -3}));
        assertEquals(1, countSubarraysOfLengthThreeWithACondition.countSubarrays(new int[]{1, 2, 1, 4, 1}));
        assertEquals(0, countSubarraysOfLengthThreeWithACondition.countSubarrays(new int[]{1, 1, 1}));
        assertEquals(9, countSubarraysOfLengthThreeWithACondition.countSubarrays(new int[]{1, 4, 1, 1, 4, 1, 1, 4, 1 , 1, 4, 1, 1, 4, 1, 1, 4, 1, 1, 4, 1 ,1, 4, 1 ,1, 4, 1}));
        assertEquals(1, countSubarraysOfLengthThreeWithACondition.countSubarrays(new int[]{-1,-4,-1,4}));



    }
}