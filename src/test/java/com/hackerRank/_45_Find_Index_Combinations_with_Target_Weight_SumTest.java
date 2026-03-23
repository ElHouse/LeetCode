package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _45_Find_Index_Combinations_with_Target_Weight_SumTest {

    _45_Find_Index_Combinations_with_Target_Weight_Sum findIndexCombinationsWithTargetWeightSum = new _45_Find_Index_Combinations_with_Target_Weight_Sum();

    @Test
    void findCombinationsByWeightIndices() {


        assertEquals(2,
                findIndexCombinationsWithTargetWeightSum.
                        findCombinationsByWeightIndices(List.of(2, 3, 6, 7), 7).size()
        );

        assertEquals(3,
                findIndexCombinationsWithTargetWeightSum.
                        findCombinationsByWeightIndices(List.of(2, 3, 5), 8).size()
        );

        assertEquals(1,
                findIndexCombinationsWithTargetWeightSum.
                        findCombinationsByWeightIndices(List.of(3, 5), 8).size()
        );

        assertEquals(1,
                findIndexCombinationsWithTargetWeightSum.
                        findCombinationsByWeightIndices(List.of(37), 37).size()
        );

        assertEquals(10,
                findIndexCombinationsWithTargetWeightSum.
                        findCombinationsByWeightIndices(List.of(8, 4, 5, 3, 9, 6), 15).size()
        );

    }


    @Test
    public void testNoSolution() {
        // weights = [5, 10], target = 3
        // No hay combinación posible
        assertEquals(0,
                findIndexCombinationsWithTargetWeightSum.
                        findCombinationsByWeightIndices(List.of(5, 10), 3).size()
        );
    }

    @Test
    public void testSingleWeightRepeated() {
        // weights = [2], target = 6
        // Combinación: [0, 0, 0] -> 2+2+2=6
        assertEquals(1,
                findIndexCombinationsWithTargetWeightSum.
                        findCombinationsByWeightIndices(List.of(2), 6).size()
        );
    }

    @Test
    public void testMultipleCombinations() {
        // weights = [2, 4], target = 8
        // Combinaciones:
        // [0,0,0,0] -> 2+2+2+2 = 8
        // [0,0,1]   -> 2+2+4   = 8
        // [1,1]     -> 4+4     = 8
        assertEquals(3,
                findIndexCombinationsWithTargetWeightSum.
                        findCombinationsByWeightIndices(List.of(2, 4), 8).size()
        );
    }

    @Test
    public void testExactMatchSingleElement() {
        // weights = [1, 5, 10], target = 10
        // Combinaciones:
        // [2] -> 10
        // [0,0,0,0,0,0,0,0,0,0] -> diez veces 1
        // [1,1] -> 5+5=10
        // [0,0,0,0,1] -> 1+1+1+1+5=10
        assertEquals(4,
                findIndexCombinationsWithTargetWeightSum.
                        findCombinationsByWeightIndices(List.of(1, 5, 10), 10).size()
        );
    }

    @Test
    public void testCapacitySmallerThanAllWeights() {
        // weights = [8, 9, 10], target = 5
        // No hay combinación posible
        assertEquals(0,
                findIndexCombinationsWithTargetWeightSum.
                        findCombinationsByWeightIndices(List.of(8, 9, 10), 5).size()
        );
    }




        @Test
        public void testBasicExample() {
            // weights = [2, 3, 6, 7], target = 7
            // Soluciones esperadas:
            // [0,0,1] -> 2+2+3
            // [3]     -> 7
            var result = findIndexCombinationsWithTargetWeightSum
                    .findCombinationsByWeightIndices(List.of(2, 3, 6, 7), 7);
            assertEquals(2, result.size());
            assertTrue(result.contains(List.of(0, 0, 1)));
            assertTrue(result.contains(List.of(3)));
        }

        @Test
        public void testSingleWeightUsedManyTimes() {
            // weights = [2], target = 6
            // Solo hay una forma: [0,0,0]
            var result = findIndexCombinationsWithTargetWeightSum
                    .findCombinationsByWeightIndices(List.of(2), 6);
            assertEquals(1, result.size());
            assertTrue(result.contains(List.of(0, 0, 0)));
        }

        @Test
        public void testNoSolutionWhenTargetTooSmall() {
            // weights = [8, 9, 10], target = 5
            // Ninguna combinación es posible
            var result = findIndexCombinationsWithTargetWeightSum
                    .findCombinationsByWeightIndices(List.of(8, 9, 10), 5);
            assertTrue(result.isEmpty());
        }

        @Test
        public void testMultipleSolutionsWithRepetitions() {
            // weights = [2, 4], target = 8
            // Posibles combinaciones:
            // [0,0,0,0] -> 2+2+2+2
            // [0,0,1]   -> 2+2+4
            // [1,1]     -> 4+4
            var result = findIndexCombinationsWithTargetWeightSum
                    .findCombinationsByWeightIndices(List.of(2, 4), 8);
            assertEquals(3, result.size());
            assertTrue(result.contains(List.of(0, 0, 0, 0)));
            assertTrue(result.contains(List.of(0, 0, 1)));
            assertTrue(result.contains(List.of(1, 1)));
        }

        @Test
        public void testCombinationWithSmallWeightAvailable() {
            // weights = [1, 5, 10], target = 10
            // Esperadas:
            // [2]                   -> 10
            // [1,1]                 -> 5+5
            // [0,0,0,0,0,0,0,0,0,0] -> diez veces 1
            // [0,0,0,0,1]           -> 1+1+1+1+5
            var result = findIndexCombinationsWithTargetWeightSum
                    .findCombinationsByWeightIndices(List.of(1, 5, 10), 10);
            assertEquals(4, result.size());
            assertTrue(result.contains(List.of(2)));
            assertTrue(result.contains(List.of(1, 1)));
            assertTrue(result.contains(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
            assertTrue(result.contains(List.of(0, 0, 0, 0, 0, 1)));
        }

        @Test
        public void testOrderShouldBeNonDecreasing() {
            // weights = [3, 5], target = 8
            // Única solución válida:
            // [0,1] -> 3+5 = 8 (orden correcto)
            // [1,0] NO debería aparecer
            var result = findIndexCombinationsWithTargetWeightSum
                    .findCombinationsByWeightIndices(List.of(3, 5), 8);
            assertEquals(1, result.size());
            assertTrue(result.contains(List.of(0, 1)));
        }

        @Test
        public void testTargetEqualToSingleWeight() {
            // weights = [3, 7, 9], target = 9
            // Solución exacta:
            // [2] -> 9
            var result = findIndexCombinationsWithTargetWeightSum
                    .findCombinationsByWeightIndices(List.of(3, 7, 9), 9);
            assertEquals(2, result.size());
            assertTrue(result.contains(List.of(2)));
            assertTrue(result.contains(List.of(0,0,0)));
        }

        @Test
        public void testLargeTargetWithSmallWeights() {
            // weights = [1, 2], target = 4
            // Posibles combinaciones:
            // [0,0,0,0] -> 1+1+1+1
            // [0,0,1]   -> 1+1+2
            // [1,1]     -> 2+2
            var result = findIndexCombinationsWithTargetWeightSum
                    .findCombinationsByWeightIndices(List.of(1, 2), 4);
            assertEquals(3, result.size());
            assertTrue(result.contains(List.of(0, 0, 0, 0)));
            assertTrue(result.contains(List.of(0, 0, 1)));
            assertTrue(result.contains(List.of(1, 1)));
        }
}