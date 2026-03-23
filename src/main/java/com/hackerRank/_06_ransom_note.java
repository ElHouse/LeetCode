package com.hackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*

Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
 */
public class _06_ransom_note {


    public void checkMagazine(List<String> magazine, List<String> note) {

        Map<String, Integer> map = new HashMap<>();

        for (String string : magazine) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }

        for (String word : note) {

            if (map.containsKey(word)) {
                int newCount = map.get(word) - 1;
                if (newCount == 0) {
                    map.remove(word);
                } else {
                    map.put(word, newCount);
                }
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }


}
