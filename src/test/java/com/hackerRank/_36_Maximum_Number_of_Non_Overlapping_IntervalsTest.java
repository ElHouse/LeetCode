package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _36_Maximum_Number_of_Non_Overlapping_IntervalsTest {
    _36_Maximum_Number_of_Non_Overlapping_Intervals maximumNumberOfNonOverlappingIntervals = new _36_Maximum_Number_of_Non_Overlapping_Intervals();


    @Test
    public void test01() {

        assertEquals(3, maximumNumberOfNonOverlappingIntervals.maximizeNonOverlappingMeetings(List.of(
                List.of(1, 2),
                List.of(2, 3),
                List.of(3, 4),
                List.of(1, 3)
        )));


        assertEquals(4, maximumNumberOfNonOverlappingIntervals.maximizeNonOverlappingMeetings(List.of(
                List.of(0, 5),
                List.of(0, 1),
                List.of(1, 2),
                List.of(2, 3),
                List.of(3, 5),
                List.of(4, 6)
        )));

        assertEquals(1, maximumNumberOfNonOverlappingIntervals.maximizeNonOverlappingMeetings(List.of(
                List.of(5, 10)
        )));



        assertEquals(3, maximumNumberOfNonOverlappingIntervals.maximizeNonOverlappingMeetings(List.of(
                List.of(1, 2),
                List.of(2, 3),
                List.of(3, 4)
        )));

    }

}