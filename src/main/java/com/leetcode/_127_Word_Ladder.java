package com.leetcode;

import java.util.*;

/*
A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:

Every adjacent pair of words differs by a single letter.
Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
sk == endWord
Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.


Example 1:
Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
Output: 5
Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.


Example 2:
Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
Output: 0
Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence

 */
public class _127_Word_Ladder {

    private static class Movement {
        String word;
        int steps;

        public Movement(String word, int steps) {
            this.word = word;
            this.steps = steps;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if (beginWord.equals(endWord)) return 1;

        int min = Integer.MAX_VALUE;
        Queue<Movement> cola = new LinkedList<>();
        cola.add(new Movement(beginWord, 1));

        while (!cola.isEmpty()) {

            Movement aux = cola.poll();

            Iterator<String> iterator = wordList.iterator();

            while (iterator.hasNext()) {
                String word = iterator.next();

                if (validMutation(word, aux.word)) {

                    if (word.equals(endWord)) {
                        min = Math.min(min, aux.steps + 1);
                    }
                    cola.add(new Movement(word, aux.steps + 1));
                    iterator.remove();
                }
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    private static boolean validMutation(String a, String b) {

        int count = 0;

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) != b.charAt(i)) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
