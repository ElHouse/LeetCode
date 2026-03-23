package com.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class _41_Check_Valid_Anagram {


    public int isAnagram(String s, String t) {
        // Write your code here


        if (s.length() != t.length()) return 0;

        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char auxA = s.charAt(i);
            char auxB = t.charAt(i);
            mapA.put(auxA, mapA.getOrDefault(auxA, 0) + 1);
            mapB.put(auxB, mapB.getOrDefault(auxB, 0) + 1);
        }


        if (mapA.size() != mapB.size()) {
            return 0;
        }

        for (Character key : mapA.keySet()) {
            if (mapB.containsKey(key)) {
                if (!mapA.get(key).equals(mapB.get(key))) {
                    return 0;
                }
            } else {
                return 0;
            }
        }

        return 1;
    }
}
