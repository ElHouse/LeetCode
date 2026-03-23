package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2260_Minimum_Consecutive_Cards_to_Pick_UpTest {


    private final _2260_Minimum_Consecutive_Cards_to_Pick_Up minimumConsecutiveCardsToPickUp = new _2260_Minimum_Consecutive_Cards_to_Pick_Up();

    @Test
    public void test01() {

        assertEquals(4, minimumConsecutiveCardsToPickUp.minimumCardPickup(new int[]{3, 4, 2, 3, 4, 7}));
        assertEquals(-1, minimumConsecutiveCardsToPickUp.minimumCardPickup(new int[]{1, 0, 5, 3}));

    }

}