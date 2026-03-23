package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _20_Find_the_nearest_cloneTest {

    _20_Find_the_nearest_clone findTheNearestClone = new _20_Find_the_nearest_clone();


    @Test
    public void test01() {

        assertEquals(-1, findTheNearestClone.findShortest(5,
                new int[]{1, 2, 2, 3},
                new int[]{2, 3, 4, 5},
                new long[]{1, 2, 3, 1, 3},
                2
        ));


        assertEquals(2, findTheNearestClone.findShortest(5,
                new int[]{1, 2, 2, 3},
                new int[]{2, 3, 4, 5},
                new long[]{1, 2, 3, 1, 3},
                1
        ));

        assertEquals(1, findTheNearestClone.findShortest(5,
                new int[]{1, 2, 2, 3},
                new int[]{2, 3, 4, 5},
                new long[]{1, 2, 3, 1, 3},
                3
        ));
    }

    @Test
    public void test02() {

        assertEquals(-1, findTheNearestClone.findShortest(4,
                new int[]{1, 1, 4},
                new int[]{2, 3, 2},
                new long[]{1, 2, 1, 1},
                2
        ));


        assertEquals(1, findTheNearestClone.findShortest(4,
                new int[]{1, 1, 4},
                new int[]{2, 3, 2},
                new long[]{1, 2, 1, 1},
                1
        ));
    }


    @Test
    public void test03() {

        assertEquals(-1, findTheNearestClone.findShortest(4,
                new int[]{1, 1, 4},
                new int[]{2, 3, 2},
                new long[]{1, 2, 3, 4},
                1
        ));


        assertEquals(-1, findTheNearestClone.findShortest(4,
                new int[]{1, 1, 4},
                new int[]{2, 3, 2},
                new long[]{1, 2, 3, 4},
                2
        ));

        assertEquals(-1, findTheNearestClone.findShortest(4,
                new int[]{1, 1, 4},
                new int[]{2, 3, 2},
                new long[]{1, 2, 3, 4},
                3
        ));


        assertEquals(-1, findTheNearestClone.findShortest(4,
                new int[]{1, 1, 4},
                new int[]{2, 3, 2},
                new long[]{1, 2, 3, 4},
                4
        ));
    }


    @Test
    public void test04() {

        assertEquals(3, findTheNearestClone.findShortest(5,
                new int[]{1, 1, 2, 3},
                new int[]{2, 3, 4, 5},
                new long[]{1, 2, 3, 3, 2},
                2));

        assertEquals(-1, findTheNearestClone.findShortest(5,
                new int[]{1, 1, 2, 3},
                new int[]{2, 3, 4, 5},
                new long[]{1, 2, 3, 3, 2},
                1));

        assertEquals(3, findTheNearestClone.findShortest(5,
                new int[]{1, 1, 2, 3},
                new int[]{2, 3, 4, 5},
                new long[]{1, 2, 3, 3, 2},
                3));
    }

}