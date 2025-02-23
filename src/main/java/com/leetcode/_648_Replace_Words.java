package com.leetcode;


import java.util.List;


public class _648_Replace_Words {


    //	Runtime: 38 ms, faster than 35.03% of Java online submissions for Replace Words.
//	Memory Usage: 54.6 MB, less than 50.00% of Java online submissions for Replace Words.
    public String replaceWords(List<String> dict, String sentence) {

        if (dict == null || dict.isEmpty()) return sentence;

        dict.forEach(s -> insertTrie(s));

        StringBuilder sb = new StringBuilder();

        String[] spl = sentence.split(" ");
        for (String s : spl) {

            sb.append(transform(s));
            sb.append(" ");

        }

        sb.deleteCharAt(sb.length() - 1);


        return sb.toString();
    }

    TrieNode root = new TrieNode();

    public void insertTrie(String word) {

        TrieNode aux = root;
        for (int i = 0; i < word.length(); i++) {
            if (aux.children[word.charAt(i) - 'a'] == null) {
                aux.children[word.charAt(i) - 'a'] = new TrieNode();
            }

            aux = aux.children[word.charAt(i) - 'a'];
        }

        aux.isAWord = true;
    }

    public String transform(String word) {

        TrieNode aux = root;

        for (int i = 0; i < word.length(); i++) {
            if (aux.children[word.charAt(i) - 'a'] == null) return word;
            aux = aux.children[word.charAt(i) - 'a'];
            if (aux.isAWord) return word.substring(0, i + 1);
        }

        if (aux.isAWord) return word;

        return word;
    }


    class TrieNode {

        int n = 26;
        boolean isAWord;
        TrieNode[] children = new TrieNode[n];

        TrieNode() {
            isAWord = false;

        }

    }


}
