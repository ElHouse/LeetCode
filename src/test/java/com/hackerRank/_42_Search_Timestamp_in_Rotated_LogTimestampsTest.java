package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _42_Search_Timestamp_in_Rotated_LogTimestampsTest {

    _42_Search_Timestamp_in_Rotated_LogTimestamps searchTimestampInRotatedLogTimestamps = new _42_Search_Timestamp_in_Rotated_LogTimestamps();


    @Test
    void searchRotatedTimestamps() {
        assertEquals(2, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(15, 18, 2, 3, 6, 12), 2));
        assertEquals(5, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(15, 18, 2, 3, 6, 12), 12));
        assertEquals(0, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(15, 18, 2, 3, 6, 12), 15));
        assertEquals(3, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(1, 3, 5, 7, 9), 7));
        assertEquals(1, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(5, 1), 1));
        assertEquals(0, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(5, 1), 5));
        assertEquals(2, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(3, 1, 2), 2));
        assertEquals(-1, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(3, 1, 2), 4));
        assertEquals(3, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(1000, 2000, 3000, 10, 20, 30), 10));
        assertEquals(4, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(-10, -5, 0, 5, -20, -15), -20));
        assertEquals(7, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), 8));
        assertEquals(-1, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 71));
        assertEquals(-1, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(4, 5, 6, 7, 0, 1, 2), 3));
        assertEquals(-1, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(30, 40, 50, 10, 20), 35));
        assertEquals(4, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(4, 5, 6, 7, 0, 1, 2), 0));
        assertEquals(0, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(6, 7, 8, 1, 2, 3, 4, 5), 6));
        assertEquals(3, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(30, 40, 50, 10, 20), 10));
        assertEquals(-1, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(), 5)); // arreglo vacío
        assertEquals(0, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(1), 1)); // un solo elemento presente
        assertEquals(-1, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(1), 2)); // un solo elemento ausente
        assertEquals(-1, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(100), 10));
        assertEquals(-1, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(), 12));
        assertEquals(0, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(100), 100));
        assertEquals(-1, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 71));
        assertEquals(2, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9), 12));
        assertEquals(3, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(
                List.of(1609466400, 1609470000, 1609473600, 1609459200, 1609462800), 1609459200));
        assertEquals(3, searchTimestampInRotatedLogTimestamps.searchRotatedTimestamps(List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 7));
    }
}