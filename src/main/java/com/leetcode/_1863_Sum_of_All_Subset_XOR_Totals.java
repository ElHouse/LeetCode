package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1863_Sum_of_All_Subset_XOR_Totals {


    public int subsetXORSum(int[] nums) {

        int total = 0;
        List<List<Integer>> listas = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            bt(i + 1, nums, List.of(nums[i]), listas);
        }


        for (List<Integer> lista : listas) {

            int suma = lista.getFirst();
            for (int i = 1; i < lista.size(); i++) {
                suma ^= lista.get(i);
            }
            total += suma;

        }

        return total;
    }

    private int bt(int i, int[] nums, List<Integer> list, List<List<Integer>> listas) {


        List<Integer> aux = new ArrayList<>(list);

        for (int j = i; j < nums.length; j++) {

            aux.add(nums[j]);
            bt(j + 1, nums, aux, listas);
            aux.removeLast();
        }

        listas.add(aux);

        return 0;
    }


}
