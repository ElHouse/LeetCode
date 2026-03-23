package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2300_Successful_Pairs_of_Spells_and_PotionsTest {

    private final _2300_Successful_Pairs_of_Spells_and_Potions successfulPairsOfSpellsAndPotions = new _2300_Successful_Pairs_of_Spells_and_Potions();

    @Test
    public void test01() {
        assertArrayEquals(new int[]{4, 0, 3}, successfulPairsOfSpellsAndPotions.successfulPairs(
                new int[]{5, 1, 3},
                new int[]{1, 2, 3, 4, 5},
                7
        ));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[]{2, 0, 2}, successfulPairsOfSpellsAndPotions.successfulPairs(
                new int[]{3, 1, 2},
                new int[]{8, 5, 8},
                16
        ));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[]{3, 0, 3}, successfulPairsOfSpellsAndPotions.successfulPairs(
                new int[]{15, 8, 19},
                new int[]{38, 36, 23},
                328
        ));
    }
}