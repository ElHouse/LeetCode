package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _567_Permutation_in_String {


    public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> countingFix = new HashMap<>();
        Map<Character, Integer> counting = new HashMap<>();
        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            countingFix.put(s1.charAt(i), countingFix.getOrDefault(s1.charAt(i), 0) + 1);
        }

        resetCouting(counting, countingFix);

        for (int right = 0; right < s2.length(); right++) {

            if (countingFix.containsKey(s2.charAt(right))) {
                counting.put(s2.charAt(right), counting.getOrDefault(s2.charAt(right), 0) + 1);
                int num = counting.get(s2.charAt(right));

                while (num > countingFix.get(s2.charAt(right))  ) {

                    counting.put(s2.charAt(left), counting.get(s2.charAt(left)) - 1);
                    set.remove(s2.charAt(left));
                    num = counting.get(s2.charAt(right));
                    left++;
                }

                if (num == countingFix.get(s2.charAt(right))) {
                    set.add(s2.charAt(right));
                }


            } else {
                left=right+1;
                resetCouting(counting, countingFix);
                set.clear();
            }

            if (set.size() == countingFix.size()) {
                return true;
            }
        }


        return false;
    }


    private void resetCouting(Map<Character, Integer> counting, Map<Character, Integer> countingFix) {
        for (Character c : countingFix.keySet()) {
            counting.put(c, 0);
        }
    }

}
