package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _967_Numbers_With_Same_Consecutive_Differences {

    public int[] numsSameConsecDiff(int n, int k) {

        Set<Integer> ans = new HashSet<>();

        for (int i = 1; i < 10; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            backtracking(n, ans, k, sb);
        }

        System.out.println(ans);

        return ans.stream().sorted().mapToInt(a -> a).toArray();
    }


    private void backtracking(int size, Set<Integer> ans, int increment, StringBuilder sb) {

        int prev = Character.getNumericValue(sb.charAt(sb.length() - 1));



        if (sb.length() == size) {
            System.out.println(sb.toString());
            ans.add(Integer.valueOf(sb.toString()));
            return;
        }

        if (prev + increment <= 9 ) {
            sb.append(prev + increment);
            backtracking(size, ans, increment, sb);
         }


        if ( prev - increment >= 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.append(prev - increment);
            backtracking(size, ans, increment, sb);
        }


    }

}
