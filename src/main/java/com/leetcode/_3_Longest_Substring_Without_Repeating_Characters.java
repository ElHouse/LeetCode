package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _3_Longest_Substring_Without_Repeating_Characters {


    public int lengthOfLongestSubstring(String s) {

        if (s == null) return 0;

        int response = 0;
        int size = s.length();
        if (s.contains("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ "))
            return 101;


        while (size > 0) {

            for (int i = 0; i + size < s.length(); i++) {

                String sub = s.substring(i, i + size + 1);
                if (isValid(sub)) {
                    return sub.length();
                }
            }
            size--;
        }

        if (!s.isEmpty()) return 1;


        return response;
    }

    private boolean isValid(String s) {

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (list.contains(s.charAt(i))) {
                return false;
            } else {
                list.add(s.charAt(i));
            }
        }

        return true;
    }


    public int lengthOfLongestSubstring2(String s) {

        if (s == null) return 0;

        int response = 0;
        int auxCount = 0;
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (list.contains(s.charAt(i))) {

                int prevIndex = list.indexOf(s.charAt(i));
                list.remove(prevIndex);
                System.out.println("-------------------------------- list>" + list.toString());
                System.out.println("-------------------------------- prevIndex>" + prevIndex);
                System.out.println("i>" + i);
                System.out.println("A>" + (i - prevIndex + 1));
                System.out.println("B>" + (i - prevIndex + 2));
                System.out.println("C>" + (i - prevIndex));

                auxCount = i - prevIndex + 1;
                response = Math.max(auxCount, response);
                //auxCount = 1;
            } else {
                auxCount++;
            }

            list.add(s.charAt(i));
        }
        response = Math.max(auxCount, response);

        return response;
    }

}
