package com.leetcode;

import org.junit.jupiter.api.Test;

class _208_Implement_Trie_Prefix_TreeTest {


    //todo poner asserts
    @Test
    public void case1() {
        _208_Implement_Trie_Prefix_Tree trie = new _208_Implement_Trie_Prefix_Tree();

        trie.insert("apple");
        trie.printTrie(trie.root);
        System.out.println(trie.search("apple"));   // returns true
        System.out.println(trie.search("app"));     // returns false
        System.out.println(trie.startsWith("app")); // returns true
        trie.insert("app");
        trie.printTrie(trie.root);
        trie.insert("dog");
        trie.printTrie(trie.root);
        System.out.println(trie.search("app"));     // returns true
    }
}