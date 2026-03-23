package com.hackerRank;

public class _15_making_anagrams {


    public int makeAnagram(String a, String b) {
        // Write your code here

        int[] count1 = new int[26];
        int[] count2 = new int[26];


        for (char c : a.toCharArray()) {
            count1[c - 'a']++;
        }

        for (char c : b.toCharArray()) {
            count2[c - 'a']++;
        }

        int diff = 0;
        for (int i = 0; i < count1.length; i++) {
            int aux = Math.abs(count1[i] - count2[i]);
            diff += aux;
        }

        return diff;
    }
}
