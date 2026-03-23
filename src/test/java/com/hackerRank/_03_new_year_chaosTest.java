package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

class _03_new_year_chaosTest {
    _03_new_year_chaos newYearChaos = new _03_new_year_chaos();

    @Test
    public void test01() {               //1  2  3  4  5  6  7  8
        newYearChaos.minimumBribes(List.of(1, 2, 5, 3, 7, 8, 6, 4));//7

        newYearChaos.minimumBribes(List.of(4, 1, 2, 3, 7, 8, 6, 5));//Too chaotic.

        newYearChaos.minimumBribes(List.of(5, 1, 2, 3, 7, 8, 6, 4));//Too chaotic.

        newYearChaos.minimumBribes(List.of(2, 1, 5, 3, 4));//3

        newYearChaos.minimumBribes(List.of(1, 2, 3, 5, 4, 6, 7, 8));//1
        newYearChaos.minimumBribes(List.of(4, 1, 2, 3));//Too chaotic.
        newYearChaos.minimumBribes(List.of(2, 5, 1, 3, 4));//Too chaotic.


    }


}