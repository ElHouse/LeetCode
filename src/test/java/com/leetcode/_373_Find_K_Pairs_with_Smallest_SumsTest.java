package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _373_Find_K_Pairs_with_Smallest_SumsTest {

    private final _373_Find_K_Pairs_with_Smallest_Sums findKPairsWithSmallestSums = new _373_Find_K_Pairs_with_Smallest_Sums();


    @Test
    public void test01() {

        List<List<Integer>> miLista = new ArrayList<>();
        miLista.add(Arrays.asList(1, 2));
        miLista.add(Arrays.asList(1, 4));
        miLista.add(Arrays.asList(1, 6));

        assertEquals(miLista, findKPairsWithSmallestSums.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3));
    }


    @Test
    public void test02() {

        List<List<Integer>> miLista = new ArrayList<>();
        miLista.add(Arrays.asList(1, 1));
        miLista.add(Arrays.asList(1, 1));

        assertEquals(miLista, findKPairsWithSmallestSums.kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 2));
    }

    @Test
    public void test03() {

        List<List<Integer>> miLista = new ArrayList<>();
        miLista.add(Arrays.asList(1, 3));
        miLista.add(Arrays.asList(2, 3));
        miLista.add(Arrays.asList(1, 5));

        assertEquals(miLista, findKPairsWithSmallestSums.kSmallestPairs(new int[]{1, 2, 4, 5, 6}, new int[]{3, 5, 7, 9}, 3));
    }


    @Test
    public void test04() {

        List<List<Integer>> miLista = new ArrayList<>();
        miLista.add(Arrays.asList(2, 87));

        assertEquals(miLista, findKPairsWithSmallestSums.kSmallestPairs(new int[]{2}, new int[]{87}, 1));
    }


    @Test
    public void test05() {

        List<List<Integer>> miLista = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 3),
                Arrays.asList(1, 5),
                Arrays.asList(4, 3),
                Arrays.asList(2, 5),
                Arrays.asList(1, 7),
                Arrays.asList(5, 3),
                Arrays.asList(6, 3),
                Arrays.asList(4, 5),
                Arrays.asList(2, 7),
                Arrays.asList(1, 9),
                Arrays.asList(5, 5),
                Arrays.asList(2, 9),
                Arrays.asList(6, 5),
                Arrays.asList(4, 7),
                Arrays.asList(5, 7),
                Arrays.asList(6, 7),
                Arrays.asList(4, 9),
                Arrays.asList(5, 9),
                Arrays.asList(6, 9)
        );


        assertEquals(miLista, findKPairsWithSmallestSums.kSmallestPairs(new int[]{1, 2, 4, 5, 6}, new int[]{3, 5, 7, 9}, 20));
    }


    @Test
    public void test06() {



        int[] A = new int[1000];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }

        int[] B = new int[1000];
        for (int i = 0; i < A.length; i++) {
            B[i] = i + 1;
        }


        assertEquals(10000, findKPairsWithSmallestSums.kSmallestPairs(A, B, 10000).size());
    }


    @Test
    public void test07() {

        int[] A = new int[100];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }

        int[] B = new int[100];
        for (int i = 0; i < A.length; i++) {
            B[i] = i + 1;
        }


        List<List<Integer>> miLista = Arrays.asList(
                Arrays.asList(1, 1), Arrays.asList(1, 2), Arrays.asList(2, 1), Arrays.asList(1, 3),
                Arrays.asList(2, 2), Arrays.asList(3, 1), Arrays.asList(1, 4), Arrays.asList(2, 3),
                Arrays.asList(3, 2), Arrays.asList(4, 1), Arrays.asList(1, 5), Arrays.asList(2, 4),
                Arrays.asList(3, 3), Arrays.asList(4, 2), Arrays.asList(5, 1), Arrays.asList(1, 6),
                Arrays.asList(2, 5), Arrays.asList(3, 4), Arrays.asList(4, 3), Arrays.asList(5, 2),
                Arrays.asList(6, 1), Arrays.asList(1, 7), Arrays.asList(2, 6), Arrays.asList(3, 5),
                Arrays.asList(4, 4), Arrays.asList(5, 3), Arrays.asList(6, 2), Arrays.asList(7, 1),
                Arrays.asList(1, 8), Arrays.asList(2, 7), Arrays.asList(3, 6), Arrays.asList(4, 5),
                Arrays.asList(5, 4), Arrays.asList(6, 3), Arrays.asList(7, 2), Arrays.asList(8, 1),
                Arrays.asList(1, 9), Arrays.asList(2, 8), Arrays.asList(3, 7), Arrays.asList(4, 6),
                Arrays.asList(5, 5), Arrays.asList(6, 4), Arrays.asList(7, 3), Arrays.asList(8, 2),
                Arrays.asList(9, 1), Arrays.asList(1, 10), Arrays.asList(2, 9), Arrays.asList(3, 8),
                Arrays.asList(4, 7), Arrays.asList(5, 6), Arrays.asList(6, 5), Arrays.asList(7, 4),
                Arrays.asList(8, 3), Arrays.asList(9, 2), Arrays.asList(10, 1), Arrays.asList(1, 11),
                Arrays.asList(2, 10), Arrays.asList(3, 9), Arrays.asList(4, 8), Arrays.asList(5, 7),
                Arrays.asList(6, 6), Arrays.asList(7, 5), Arrays.asList(8, 4), Arrays.asList(9, 3),
                Arrays.asList(10, 2), Arrays.asList(11, 1), Arrays.asList(1, 12), Arrays.asList(2, 11),
                Arrays.asList(3, 10), Arrays.asList(4, 9), Arrays.asList(5, 8), Arrays.asList(6, 7),
                Arrays.asList(7, 6), Arrays.asList(8, 5), Arrays.asList(9, 4), Arrays.asList(10, 3),
                Arrays.asList(11, 2), Arrays.asList(12, 1), Arrays.asList(1, 13), Arrays.asList(2, 12),
                Arrays.asList(3, 11), Arrays.asList(4, 10), Arrays.asList(5, 9), Arrays.asList(6, 8),
                Arrays.asList(7, 7), Arrays.asList(8, 6), Arrays.asList(9, 5), Arrays.asList(10, 4),
                Arrays.asList(11, 3), Arrays.asList(12, 2), Arrays.asList(13, 1), Arrays.asList(1, 14),
                Arrays.asList(2, 13), Arrays.asList(3, 12), Arrays.asList(4, 11), Arrays.asList(5, 10),
                Arrays.asList(6, 9), Arrays.asList(7, 8), Arrays.asList(8, 7), Arrays.asList(9, 6)
        );


        assertEquals(miLista, findKPairsWithSmallestSums.kSmallestPairs(A, B, 100));
    }
}

