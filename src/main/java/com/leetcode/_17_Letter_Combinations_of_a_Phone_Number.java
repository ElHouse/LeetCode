package com.leetcode;

import java.util.*;

public class _17_Letter_Combinations_of_a_Phone_Number {

    private final List<String> response = new ArrayList<>();
    private final Map<Character, List<String>> map = new HashMap<>();


    public _17_Letter_Combinations_of_a_Phone_Number() {
        map.put('1', new ArrayList<>());
        map.put('2', List.of("a", "b", "c"));
        map.put('3', List.of("d", "e", "f"));
        map.put('4', List.of("g", "h", "i"));
        map.put('5', List.of("j", "k", "l"));
        map.put('6', List.of("m", "n", "o"));
        map.put('7', List.of("p", "q", "r", "s"));
        map.put('8', List.of("t", "u", "v"));
        map.put('9', List.of("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        response.clear();

        if (digits == null || digits.isBlank()) {
            return response;
        }

        process(digits, 0, "");

        return response;
    }


    private void process(String digits, int i, String combination) {


        if (digits.length() == i) {
            response.add(combination);
        } else {
            List<String> letters = map.get(digits.charAt(i));

            for (int j = 0; j < letters.size(); j++) {

                String aux = combination + letters.get(j);
                process(digits, i + 1, aux);
            }

        }


    }
}