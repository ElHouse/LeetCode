package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _30_Find_Peak_Element_in_Bitonic_ArrayTest {

    _30_Find_Peak_Element_in_Bitonic_Array findPeakElementInBitonicArray = new _30_Find_Peak_Element_in_Bitonic_Array();

    @Test
    void findPeakIndex() {

        assertEquals(2, findPeakElementInBitonicArray.findPeakIndex(List.of(1, 3, 5, 4, 2)));
        assertEquals(1, findPeakElementInBitonicArray.findPeakIndex(List.of(1, 3, 2)));
        assertEquals(2, findPeakElementInBitonicArray.findPeakIndex(List.of(1, 2, 3, 2, 1)));

        assertEquals(6, findPeakElementInBitonicArray.findPeakIndex(List.of(1, 2, 3, 4, 5, 6, 7, 2, 1)));
        assertEquals(8, findPeakElementInBitonicArray.findPeakIndex(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 1, 0, -1, -2, -3, -4, -5)));

    }
}