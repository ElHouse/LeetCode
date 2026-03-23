package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _25_Find_the_SmallestMissing_Positive_IntegerTest {


    _25_Find_the_SmallestMissing_Positive_Integer findTheSmallestMissingPositiveInteger = new _25_Find_the_SmallestMissing_Positive_Integer();


    @Test
    void findSmallestMissingPositive() {
        assertEquals(2,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive((new ArrayList<>(List.of(1)))));
        assertEquals(2,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(new ArrayList<>(List.of(3, 4, -1, 1))));
        assertEquals(2,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive((new ArrayList<>(List.of(3, 4, -1, 1, 10, 20)))));

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive((new ArrayList<>(List.of(6, 8, -9, 10, 101, 20)))));

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive((new ArrayList<>(List.of(9,8,7,6,5,3)))));

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive((new ArrayList<>(List.of(9,8,7,6,5,4,3)))));

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive((new ArrayList<>())));

        assertEquals(10,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive((new ArrayList<>(List.of(9,8,7,6,5,4,3,2,1)))));

    }


    @Test
    void findSmallestMissingPositive2() {
        assertEquals(2,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(3, 4, -1, 1))));

        assertEquals(3,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 2, 0))));

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(7, 8, 9, 11, 12))));

        assertEquals(4,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 2, 3))));

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(-1, -2, -3))));

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(2, 3, 4))));

        assertEquals(2,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 1, 0, -1))));

        assertEquals(4,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(5, 3, 2, 1))));

        assertEquals(4,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 2, 3, 5))));

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(10, 11, 12))));

        assertEquals(4,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 2, 6, 3, 5))));

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(2))));

        assertEquals(2,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1))));

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(0))));

        assertEquals(10,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(9, 8, 7, 6, 5, 4, 3, 2, 1))));

        assertEquals(5,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(4, 3, 2, 1, 6))));

        assertEquals(5,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 2, 3, 4, 6, 7, 8))));

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(100, 101, 102))));

        assertEquals(6,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 2, 3, 4, 5, 7))));

        assertEquals(2,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(Integer.MAX_VALUE, 1))));


        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of()))); // arreglo vacío

        assertEquals(2,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 1, 1)))); // solo 1s

        assertEquals(3,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 2, 2)))); // duplicado de 2

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(-5, -4, -3, -2, -1)))); // solo negativos

        assertEquals(5,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 2, 3, 4, 6, 7, 8, 9, 10)))); // falta el 5

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(0, 0, 0)))); // solo ceros

        assertEquals(4,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(2, 3, 1, 5, 6, 7, 8, 9, 10)))); // falta el 4

        assertEquals(2,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1000, 1)))); // valores grandes + 1

        assertEquals(3,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(2, 1, 4, 5, 6, 7, 8, 9, 10)))); // falta el 3

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(Integer.MIN_VALUE, -1000000)))); // extremos negativos

        assertEquals(2,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, Integer.MAX_VALUE)))); // extremos positivos

        assertEquals(6,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 2, 3, 4, 5, 7, 8, 9, 10)))); // falta el 6

        assertEquals(1,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(999999999, 888888888)))); // solo valores enormes

        assertEquals(4,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 2, 3, 5, 6, 7, 8, 9, 10)))); // falta el 4

        assertEquals(3,
                findTheSmallestMissingPositiveInteger.findSmallestMissingPositive(
                        new ArrayList<>(List.of(1, 2, 4, 5, 6, 7, 8, 9, 10)))); // falta el 3

    }
}