package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _2456_Most_Popular_Video_CreatorTest {


    private final _2456_Most_Popular_Video_Creator mostPopularVideoCreator = new _2456_Most_Popular_Video_Creator();


    @Test
    public void test01() {

        List<List<String>> expected = List.of(List.of("alice", "one"), List.of("bob", "two"));
        List<List<String>> response = mostPopularVideoCreator.mostPopularCreator(new String[]{"alice", "bob", "alice", "chris"},
                new String[]{"one", "two", "three", "four"},
                new int[]{5, 10, 5, 4}
        );


        assertTrue(expected.size() == response.size() &&
                expected.stream().allMatch(response::contains));
    }

    @Test
    public void test02() {

        List<List<String>> expected = List.of(List.of("alice", "b"));
        List<List<String>> response = mostPopularVideoCreator.mostPopularCreator(new String[]{"alice", "alice", "alice"},
                new String[]{"a", "b", "c"},
                new int[]{1, 2, 2}
        );


        assertEquals(expected, response);
    }

    @Test
    public void test03() {

        List<List<String>> expected = List.of(List.of("alice", "a"));
        List<List<String>> response = mostPopularVideoCreator.mostPopularCreator(new String[]{"alice", "alice", "alice"},
                new String[]{"a", "b", "c"},
                new int[]{2, 2, 2}
        );


        assertEquals(expected, response);
    }

    @Test
    public void test04() {

        List<List<String>> expected = List.of(List.of("alice", "a"), List.of("alice2", "a"), List.of("alice3", "a"));
        List<List<String>> response = mostPopularVideoCreator.mostPopularCreator(new String[]{"alice", "alice", "alice",
                        "alice2", "alice2", "alice2",
                        "alice3", "alice3", "alice3"},
                new String[]{"a", "b", "c", "a", "b", "c", "a", "b", "c"},
                new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2}
        );


        assertEquals(expected, response);
    }


    @Test
    public void test05() {

        List<List<String>> expected = List.of(List.of("alice3", "c"));
        List<List<String>> response = mostPopularVideoCreator.mostPopularCreator(new String[]{
                        "alice", "alice", "alice",
                        "alice2", "alice2", "alice2",
                        "alice3", "alice3", "alice3"},
                new String[]{"a", "b", "c", "a", "b", "c", "a", "b", "c"},
                new int[]{2, 2, 2, 3, 4, 3, 6, 7, 8}
        );


        assertEquals(expected, response);
    }

}