package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _2351_First_Letter_to_Appear_Twice {


    public char repeatedCharacter(String s) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                return s.charAt(i);
            }
        }

        return ' ';
    }


}
