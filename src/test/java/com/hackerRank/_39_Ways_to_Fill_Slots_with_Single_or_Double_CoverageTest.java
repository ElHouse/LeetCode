package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _39_Ways_to_Fill_Slots_with_Single_or_Double_CoverageTest {
    _39_Ways_to_Fill_Slots_with_Single_or_Double_Coverage waysToFillSlotsWithSingleOrDoubleCoverage = new _39_Ways_to_Fill_Slots_with_Single_or_Double_Coverage();


    @Test
    public void test01() {
        assertEquals("1", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(0));
        assertEquals("1", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(1));
        assertEquals("2", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(2));
        assertEquals("3", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(3));
        assertEquals("5", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(4));
        assertEquals("8", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(5));
        assertEquals("13", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(6));
        assertEquals("21", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(7));
        assertEquals("34", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(8));
        assertEquals("55", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(9));
        assertEquals("89", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(10));

    }

    @Test
    public void testCountInstallationSequencesExtended() {
        assertEquals("144", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(11));
        assertEquals("233", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(12));
        assertEquals("377", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(13));
        assertEquals("610", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(14));
        assertEquals("987", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(15));
        assertEquals("1597", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(16));
        assertEquals("2584", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(17));
        assertEquals("4181", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(18));
        assertEquals("6765", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(19));
        assertEquals("10946", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(20));
        assertEquals("70330367711422815821835254877183549770181269836358732742604905087154537118196933579742249494562611733487750449241765991088186363265450223647106012053374121273867339111198139373125598767690091902245245323403501", waysToFillSlotsWithSingleOrDoubleCoverage.countInstallationSequences(1000));
    }


}