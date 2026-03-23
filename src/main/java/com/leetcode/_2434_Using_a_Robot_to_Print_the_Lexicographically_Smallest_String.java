package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class _2434_Using_a_Robot_to_Print_the_Lexicographically_Smallest_String {


    public String robotWithString(String s) {

        StringBuilder p = new StringBuilder();
        Stack<Character> t = new Stack<>();

        int[] abcd = new int[26];
        char minCharacter = 'a';
        for (char c : s.toCharArray()) {
            abcd[c - 'a']++;
        }

        for (char c : s.toCharArray()) {

            t.push(c);
            abcd[c - 'a']--;

            while (minCharacter != 'z' && abcd[minCharacter - 'a'] == 0) {
                minCharacter++;
            }
            while (!t.isEmpty() && t.peek() <= minCharacter) {
                p.append(t.pop());
            }



        }

        return p.toString();
    }


}
