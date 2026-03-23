package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _216_Combination_Sum_III {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> response = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            List<Integer> aux = new ArrayList<>();
            aux.add(i);
            backTracking(response, aux, k, n, i, i + 1);
        }


        response.forEach(a -> System.out.println(a));

        return response;
    }


    private void backTracking(List<List<Integer>> ans, List<Integer> auxList, int size, int target, int suma, int index) {

        if (auxList.size() > size) return;
        if (suma > target) return;

        if (suma == target && auxList.size() == size) {
            ans.add(new ArrayList<>(auxList));
            return;
        }

        for (int i = index; i <= 9; i++) {

            suma += i;
            auxList.add(i);
            backTracking(ans, auxList, size, target, suma, i + 1);
            auxList.removeLast();
            suma -= i;
        }
    }


}
