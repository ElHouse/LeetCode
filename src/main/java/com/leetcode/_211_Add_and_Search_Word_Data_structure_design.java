package com.leetcode;


public class _211_Add_and_Search_Word_Data_structure_design {
/*
    public _211_Add_and_Search_Word_Data_structure_design() {
        root = new TrieNode();
    }

    TrieNode root = null;

//      Adds a word into the data structure.

    public void addWord(String word) {

        TrieNode cur = root;

        for (char ch : word.toCharArray()) {

            if (cur.children[ch - 'a'] == null)
                cur.children[ch - 'a'] = new TrieNode();
            cur = cur.children[ch - 'a'];
        }

        cur.word = word;
    }


     // Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.

    public boolean search(String word) {

        return search(word, 0, root);
    }

    public boolean search(String word, int i, TrieNode node) {


        if (i == word.length())
            return node.isWordEnd;

        char ch = word.charAt(i);

        if (ch == '.') {
            for (Character character : node.map.keySet()) {
                if (search(word, i + 1, node.map.get(character)))
                    return true;
            }

            return false;
        } else {
            if (node.map.containsKey(ch)) {
                return search(word, i + 1, node.map.get(ch));
            }
        }

        return false;
    }


    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }
*/

}
