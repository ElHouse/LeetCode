package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _33_Time_Slot_Task_PairingTest {
    _33_Time_Slot_Task_Pairing timeSlotTaskPairing = new _33_Time_Slot_Task_Pairing();

    @Test
    public void test01() {
        assertEquals(List.of(0, 3), timeSlotTaskPairing.findTaskPairForSlot(List.of(2, 7, 11, 15), 17));

        assertEquals(List.of(0, 1), timeSlotTaskPairing.findTaskPairForSlot(List.of(2, 7, 11, 15), 9));
        assertEquals(List.of(-1, -1), timeSlotTaskPairing.findTaskPairForSlot(List.of(2, 7, 11, 15), 3));
    }
}