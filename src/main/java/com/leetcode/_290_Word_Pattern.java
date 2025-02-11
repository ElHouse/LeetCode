package com.leetcode;


import java.util.HashMap;
import java.util.Map;


public class _290_Word_Pattern {


    //	Runtime: 1 ms, faster than 99.66% of Java online submissions for Word Pattern.
//	Memory Usage: 34.1 MB, less than 97.30% of Java online submissions for Word Pattern.
    public boolean wordPattern(String pattern, String str) {

        if (pattern == null || str == null) {
            return false;
        }

        Map<String, String> mapA = new HashMap<>();
        Map<String, String> mapB = new HashMap<>();
        String[] words = str.split(" ");
        int i = 0;

        if (words.length != pattern.length()) return false;

        for (Character c : pattern.toCharArray()) {

            if (mapA.containsKey(String.valueOf(c))) {
                if (!mapA.get(String.valueOf(c)).equals(words[i])) {
                    return false;
                }
            } else {
                mapA.put(String.valueOf(c), words[i]);
            }

            if (mapB.containsKey(String.valueOf(words[i]))) {

                if (!mapB.get(words[i]).equals(String.valueOf(c))) {
                    return false;
                }
            } else {
                mapB.put(words[i], String.valueOf(c));
            }

            i++;
//			map.forEach((k,v)-> System.out.println("K:"+k+"--V>"+v));
            System.out.println("---------");
        }

        return true;
    }


}

