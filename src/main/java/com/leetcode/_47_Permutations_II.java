package com.leetcode;

import java.util.*;

public class _47_Permutations_II {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        test(ans, nums, new StringBuilder(), new HashSet<>());

        ans.forEach(a -> System.out.println(a));

        return ans;
    }


    private static void test(List<List<Integer>> ans, int[] nums, StringBuilder sb, Set<String> set) {

        if (sb.length() == nums.length) {
            StringBuilder word = new StringBuilder();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < sb.length(); i++) {
                int num = nums[Character.getNumericValue(sb.charAt(i))];
                word.append(num);
                list.add(num);
            }

            if (!set.contains(word.toString())) {
                set.add(word.toString());
                ans.add(list);
            }

            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (sb.indexOf(i + "") == -1) {
                sb.append(i);
                test(ans, nums, sb, set);
                sb.deleteCharAt(sb.length() - 1);
            }
        }

    }

}
