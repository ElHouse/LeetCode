package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _1189_Maximum_Number_of_BalloonsTest {

    private final _1189_Maximum_Number_of_Balloons maximumNumberOfBalloons = new _1189_Maximum_Number_of_Balloons();

    @Test
    public void case1() {
        String text = "nlaebolko";
        assertEquals(1, maximumNumberOfBalloons.maxNumberOfBalloons(text));
    }


    @Test
    public void case2() {
        String text = "loonbalxballpoon";
        assertEquals(2, maximumNumberOfBalloons.maxNumberOfBalloons(text));
    }

    @Test
    public void case3() {
        String text = "leetcode";
        assertEquals(0, maximumNumberOfBalloons.maxNumberOfBalloons(text));
    }

}