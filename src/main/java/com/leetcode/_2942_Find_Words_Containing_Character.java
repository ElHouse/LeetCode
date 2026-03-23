package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _2942_Find_Words_Containing_Character {


    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> response = new ArrayList<>();
        if (words == null) return response;

        for (int i = 0; i < words.length; i++) {

            if (words[i].contains(String.valueOf(x))) {
                response.add(i);
            }
        }

        return response;
    }
}
