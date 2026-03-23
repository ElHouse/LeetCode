package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class _2506_Count_Pairs_Of_Similar_Strings {

    public int similarPairs(String[] words) {

        int count = 0;

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = i + 1; j < words.length; j++) {
                count += check(word, words[j]);
            }
        }

        return count;
    }


    private int check(String a, String b) {

        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();

        for (char c : a.toCharArray()) setA.add(String.valueOf(c));
        for (char c : b.toCharArray()) setB.add(String.valueOf(c));

        return setA.equals(setB) ? 1 : 0;
    }


}
