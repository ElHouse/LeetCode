package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _34_Lookup_with_Binary_SearchTest {
    _34_Lookup_with_Binary_Search lookupWithBinarySearch = new _34_Lookup_with_Binary_Search();


    @Test
    public void test01() {
        assertEquals(2, lookupWithBinarySearch.binarySearch(List.of(1, 2, 3, 4, 5), 3));
        assertEquals(7, lookupWithBinarySearch.binarySearch(List.of(2, 4, 6, 8, 10, 12, 14, 16), 16));
        assertEquals(-1, lookupWithBinarySearch.binarySearch(List.of(0), 3));
        assertEquals(1, lookupWithBinarySearch.binarySearch(List.of(1, 10), 10));
        assertEquals(0, lookupWithBinarySearch.binarySearch(List.of(10), 10));
        assertEquals(-1, lookupWithBinarySearch.binarySearch(null, 10));
        assertEquals(-1, lookupWithBinarySearch.binarySearch(new ArrayList<>(), 10));
    }


}