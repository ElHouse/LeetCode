package com.hackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class _17_sherlock_and_valid_string {


    public String isValid(String s) {
        // Write your code here

        if (s == null || s.isEmpty()) return "NO";

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int prev = Integer.MAX_VALUE;
        boolean oneNotValid = true;

        for (int i = 0; i < count.length; i++) {

            if (count[i] != 0) {

                if (prev == Integer.MAX_VALUE) {
                    prev = count[i];
                } else {
                    if (prev != count[i]) {

                        if (oneNotValid) {

                            if (Math.abs(prev - count[i]) != 1) {

                                if (prev != 1 && count[i] == 1) {
                                    oneNotValid = false;
                                    continue;
                                }

                                return "NO";
                            }
                            oneNotValid = false;
                        } else {
                            return "NO";
                        }

                    }
                }
            }
        }

        return "YES";
    }
}
