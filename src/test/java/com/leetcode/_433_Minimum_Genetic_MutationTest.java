package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _433_Minimum_Genetic_MutationTest {

    private final _433_Minimum_Genetic_Mutation minimumGeneticMutation = new _433_Minimum_Genetic_Mutation();


    @Test
    public void test01() {
        assertEquals(1, minimumGeneticMutation.minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"}));
    }

    @Test
    public void test02() {
        assertEquals(2, minimumGeneticMutation.minMutation("AACCGGTT", "AAACGGTA", new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
    }


    @Test
    public void test03() {
        assertEquals(8, minimumGeneticMutation.minMutation("AAAAAAAA", "CCCCCCCC", new String[]{
                "ACAAAAAA", "AAACAAAA", "CCCCCCCC",
                "CCACCCCC", "CAACCCCC", "AAACCCCC",
                "AAAACCCC", "AAAAACCC", "AAAAAACC",
                "AAAAAAAC"}));
    }


    @Test
    public void test04() {
        assertEquals(-1, minimumGeneticMutation.minMutation("AAAAAAAA", "CCCCTCCC", new String[]{
                "ACAAAAAA", "AAACAAAA", "CCCCCCCC",
                "CCACCCCC", "CAACCCCC", "AAACCCCC",
                "AAAACCCC", "AAAAACCC", "AAAAAACC",
                "AAAAAAAC"}));
    }

}