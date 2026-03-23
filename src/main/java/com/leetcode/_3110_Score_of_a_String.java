package com.leetcode;

public class _3110_Score_of_a_String {


    public int scoreOfString(String s) {

        if (s == null || s.isEmpty()) return 0;

        int suma = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int aux = Math.abs(s.charAt(i) - s.charAt(i + 1));
            suma += aux;
        }

        return suma;
    }


}
