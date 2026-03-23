package com.leetcode;

import java.util.Arrays;

public class _2300_Successful_Pairs_of_Spells_and_Potions {
/*
You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.

You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.

Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.



Example 1:
Input: spells = [5,1,3], potions = [1,2,3,4,5], success = 7
Output: [4,0,3]
Explanation:
- 0th spell: 5 * [1,2,3,4,5] = [5,10,15,20,25]. 4 pairs are successful.
- 1st spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
- 2nd spell: 3 * [1,2,3,4,5] = [3,6,9,12,15]. 3 pairs are successful.
Thus, [4,0,3] is returned.


Example 2:
Input: spells = [3,1,2], potions = [8,5,8], success = 16
Output: [2,0,2]
Explanation:
- 0th spell: 3 * [8,5,8] = [24,15,24]. 2 pairs are successful.
- 1st spell: 1 * [8,5,8] = [8,5,8]. 0 pairs are successful.
- 2nd spell: 2 * [8,5,8] = [16,10,16]. 2 pairs are successful.
Thus, [2,0,2] is returned.
*/


    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);
        int[] response = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {

            int multi = spells[i];
            int a = 0;
            int b = potions.length;

            while (a + 1 != b) {

                int mitad = (a + b + 1) / 2;
                long aux = (long) multi * potions[mitad];
                if (aux >= success) {
                    b = mitad;
                } else {
                    a = mitad;
                }

            }


            /*
            ;

            // Búsqueda binaria para encontrar el primer índice válido
            Verion de Copilot
            while (left <= right) {
                int mid = (left + right) / 2;
                long product = (long) spell * potions[mid];
                if (product >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;

             */

            long aux = (long) multi * potions[a];
            if (aux >= success) {
                b = a;
            }

            response[i] = potions.length - b;


        }


        return response;
    }


    public int[] successfulPairs2(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);
        int[] response = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {

            int multi = spells[i];
            for (int j = 0; j < potions.length; j++) {

                long aux = (long) multi * potions[j];
                if (success <= aux) {
                    response[i] = potions.length - j;
                    break;
                }
            }
        }


        return response;
    }


}
