package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _01_array_left_rotationTest {


    _01_array_left_rotation arrayLeftRotation = new _01_array_left_rotation();

    @Test
    public void test01() {
        assertEquals(List.of(1, 2, 3, 4, 5), arrayLeftRotation.rotLeft(List.of(1, 2, 3, 4, 5), 0));
        assertEquals(List.of(2, 3, 4, 5, 1), arrayLeftRotation.rotLeft(List.of(1, 2, 3, 4, 5), 1));
        assertEquals(List.of(3, 4, 5, 1, 2), arrayLeftRotation.rotLeft(List.of(1, 2, 3, 4, 5), 2));
        assertEquals(List.of(4, 5, 1, 2, 3), arrayLeftRotation.rotLeft(List.of(1, 2, 3, 4, 5), 3));
        assertEquals(List.of(5, 1, 2, 3, 4), arrayLeftRotation.rotLeft(List.of(1, 2, 3, 4, 5), 4));
        assertEquals(List.of(1, 2, 3, 4, 5), arrayLeftRotation.rotLeft(List.of(1, 2, 3, 4, 5), 5));
        assertEquals(List.of(2, 3, 4, 5, 1), arrayLeftRotation.rotLeft(List.of(1, 2, 3, 4, 5), 6));
        assertEquals(List.of(3, 4, 5, 1, 2), arrayLeftRotation.rotLeft(List.of(1, 2, 3, 4, 5), 7));
        assertEquals(List.of(4, 5, 1, 2, 3), arrayLeftRotation.rotLeft(List.of(1, 2, 3, 4, 5), 8));
    }
}