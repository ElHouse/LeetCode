package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _28_First_Occurrence_in_Event_Code_LogTest {

    _28_First_Occurrence_in_Event_Code_Log firstOccurrenceInEventCodeLog = new _28_First_Occurrence_in_Event_Code_Log();


    @Test
    void findFirstOccurrence() {
        assertEquals(2, firstOccurrenceInEventCodeLog.findFirstOccurrence(List.of(1, 2, 3, 3, 3, 3, 3, 3, 4, 5), 3));
        assertEquals(2, firstOccurrenceInEventCodeLog.findFirstOccurrence(List.of(1, 2, 3, 4, 5), 3));
        assertEquals(0, firstOccurrenceInEventCodeLog.findFirstOccurrence(List.of(1, 2, 3, 4, 5), 1));
        assertEquals(4, firstOccurrenceInEventCodeLog.findFirstOccurrence(List.of(1, 2, 3, 4, 5), 5));
        assertEquals(1, firstOccurrenceInEventCodeLog.findFirstOccurrence(List.of(1, 2, 3, 4), 2));
        assertEquals(1, firstOccurrenceInEventCodeLog.findFirstOccurrence(List.of(1, 2, 2, 2, 2), 2));
        assertEquals(1, firstOccurrenceInEventCodeLog.findFirstOccurrence(List.of(1, 2, 2, 2), 2));
        assertEquals(1, firstOccurrenceInEventCodeLog.findFirstOccurrence(List.of(1, 2, 2, 2), 2));
        assertEquals(-1, firstOccurrenceInEventCodeLog.findFirstOccurrence(List.of(1, 2, 2, 2), 3));
        assertEquals(-1, firstOccurrenceInEventCodeLog.findFirstOccurrence(List.of(0,5), 3));
        assertEquals(-1, firstOccurrenceInEventCodeLog.findFirstOccurrence(new ArrayList<>(), 3));
        assertEquals(-1, firstOccurrenceInEventCodeLog.findFirstOccurrence(null, 3));

    }
}