package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _374_Guess_Number_Higher_or_LowerTest {

    _374_Guess_Number_Higher_or_Lower guessNumberHigherOrLower = new _374_Guess_Number_Higher_or_Lower();

    @Test
    public void case1() throws InterruptedException {
        System.out.println("case 1");
        int n = 10;
        guessNumberHigherOrLower.x = 6;
        assertEquals(guessNumberHigherOrLower.x, guessNumberHigherOrLower.guessNumber(n));
    }

    @Test
    public void case2() throws InterruptedException {
        System.out.println("case 2");
        int n = 1;
        guessNumberHigherOrLower.x = 1;
        assertEquals(guessNumberHigherOrLower.x, guessNumberHigherOrLower.guessNumber(n));
    }

    @Test
    public void case3() throws InterruptedException {
        System.out.println("case 3");
        int n = 2126753390;
        guessNumberHigherOrLower.x = 1702766719;
        assertEquals(guessNumberHigherOrLower.x, guessNumberHigherOrLower.guessNumber(n));
    }

}