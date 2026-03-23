package com.leetcode;

import java.util.*;

public class _1268_Search_Suggestions_System {


    class Trie {

        List<String> words;
        Map<Character, Trie> node;

        public Trie() {
            node = new HashMap<>();
            words = new ArrayList<>();
        }
    }


    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        List<List<String>> lists = new ArrayList<>();

        Trie head = new Trie();

        for (String product : products) {
            Trie root = head;

            for (char c : product.toCharArray()) {

                if (!root.node.containsKey(c)) {
                    root.node.put(c, new Trie());
                }
                root = root.node.get(c);
                root.words.add(product);
            }
        }

        Trie root = head;

        int count = 0;

        for (char c : searchWord.toCharArray()) {

            if (root.node.containsKey(c)) {
                root = root.node.get(c);

                count++;
                if (count > 2) {
                    lists.add(root.words);
                }
            }
        }

        return null;
    }


    public static void main(String[] args) {
        _1268_Search_Suggestions_System searchSuggestionsSystem = new _1268_Search_Suggestions_System();


        searchSuggestionsSystem.suggestedProducts(new String[]{"PERRO", "CARNE", "CALLE", "CAL","CALOR", "CALICULA", "CALENTURA", "CALDO", "CALON", "CALEPO"}, "CALE");
    }

}
