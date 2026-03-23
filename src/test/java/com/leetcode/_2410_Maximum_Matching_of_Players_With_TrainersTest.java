package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2410_Maximum_Matching_of_Players_With_TrainersTest {

    private final _2410_Maximum_Matching_of_Players_With_Trainers maximumMatchingOfPlayersWithTrainers = new _2410_Maximum_Matching_of_Players_With_Trainers();

    @Test
    public void test01() {
        assertEquals(2, maximumMatchingOfPlayersWithTrainers.matchPlayersAndTrainers(new int[]{4, 7, 9}, new int[]{8, 2, 5, 8}));
        assertEquals(1, maximumMatchingOfPlayersWithTrainers.matchPlayersAndTrainers(new int[]{4, 7, 9}, new int[]{10}));

        assertEquals(0, maximumMatchingOfPlayersWithTrainers.matchPlayersAndTrainers(new int[]{49}, new int[]{10}));
        assertEquals(5, maximumMatchingOfPlayersWithTrainers.matchPlayersAndTrainers(new int[]{4, 7, 9, 4, 7, 9}, new int[]{10,10,10,10,10}));

    }
}