package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _09_count_triplets_1Test {


    _09_count_triplets_1 countTriplets1 = new _09_count_triplets_1();


    @Test
    public void test01() {
        assertEquals(2, countTriplets1.countTriplets(List.of(1L, 2L, 2L, 4L), 2));
        assertEquals(2, countTriplets1.countTriplets(List.of(1L, 4L, 16L, 64L), 4));
        assertEquals(6, countTriplets1.countTriplets(List.of(1L, 3L, 9L, 9L, 27L, 81L), 3));
        assertEquals(4, countTriplets1.countTriplets(List.of(1L, 5L, 5L, 25L, 125L), 5));

        assertEquals(2, countTriplets1.countTriplets(List.of(5L, 5L, 1L, 25L, 125L), 5));
        assertEquals(0, countTriplets1.countTriplets(List.of(5L, 5L, 1L, 125L, 1215L), 5));

        List<Long> a = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            a.add(1L);
        }
        assertEquals(4, countTriplets1.countTriplets(a, 1));


        a = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            a.add(1L);
        }
        assertEquals(10, countTriplets1.countTriplets(a, 1));

        a = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            a.add(1L);
        }
        assertEquals(19, countTriplets1.countTriplets(a, 1));

        a = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            a.add(1L);
        }
        assertEquals(29, countTriplets1.countTriplets(a, 1));

        a = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            a.add(1L);
        }
        assertEquals(161_700, countTriplets1.countTriplets(a, 1));
    }


    @Test
    public void test02() {
        List<Long> a = new ArrayList<>();


        a = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            a.add(1L);
        }
        assertEquals(19, countTriplets1.countTriplets(a, 1));


    }

}