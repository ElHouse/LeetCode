package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _17_Letter_Combinations_of_a_Phone_Number {


    public List<String> letterCombinations(String digits) {

        Map<Character, List<String>> map = new HashMap<>();
        List<String> response = new ArrayList<>();

        if (digits == null || digits.isBlank()) {
            return response;
        }

        map.put('1', new ArrayList<>());
        map.put('2', List.of("a", "b", "c"));
        map.put('3', List.of("d", "e", "f"));
        map.put('4', List.of("g", "h", "i"));
        map.put('5', List.of("j", "k", "l"));
        map.put('6', List.of("m", "n", "o"));
        map.put('7', List.of("p", "q", "r", "s"));
        map.put('8', List.of("t", "u", "v"));
        map.put('9', List.of("w", "x", "y", "z"));

        StringBuilder sb = new StringBuilder();

        backtracking(response, sb, map, digits, 0);

        return response;
    }


    private void backtracking(List<String> response, StringBuilder sb, Map<Character, List<String>> map, String digits, int index) {

        if (sb.length() == digits.length()) {
            response.add(sb.toString());
            return;
        }

        for (String str : map.getOrDefault(digits.charAt(index), new ArrayList<>())) {
            sb.append(str);
            backtracking(response, sb, map, digits, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}