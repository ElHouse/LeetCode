package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2769_Find_the_Maximum_Achievable_NumberTest {
    _2769_Find_the_Maximum_Achievable_Number findTheMaximumAchievableNumber = new _2769_Find_the_Maximum_Achievable_Number();


    @Test
    public void test01() {

        assertEquals(6, findTheMaximumAchievableNumber.theMaximumAchievableX(4,1));
        assertEquals(7, findTheMaximumAchievableNumber.theMaximumAchievableX(3,2));
    }
}