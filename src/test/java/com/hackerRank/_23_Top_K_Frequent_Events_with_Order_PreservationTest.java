package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _23_Top_K_Frequent_Events_with_Order_PreservationTest {
    _23_Top_K_Frequent_Events_with_Order_Preservation topKFrequentEventsWithOrderPreservation = new _23_Top_K_Frequent_Events_with_Order_Preservation();

    @Test
    public void test01() {

        assertEquals(List.of(1, 2), topKFrequentEventsWithOrderPreservation.getTopKFrequentEvents(List.of(1, 2, 1, 3, 2, 1), 2));
        assertEquals(List.of(2, 4, 1), topKFrequentEventsWithOrderPreservation.getTopKFrequentEvents(List.of(4, 4, 1, 2, 2, 3, 1, 3, 2), 3));

        assertEquals(List.of(), topKFrequentEventsWithOrderPreservation.getTopKFrequentEvents(List.of(0), 0));
        assertEquals(List.of(5), topKFrequentEventsWithOrderPreservation.getTopKFrequentEvents(List.of(5, 1), 1));


    }



}