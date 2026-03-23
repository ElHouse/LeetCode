package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _127_Word_LadderTest {


    private final _127_Word_Ladder wordLadder = new _127_Word_Ladder();


    @Test
    public void test01(){
        List<String> list = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
        assertEquals(5, wordLadder.ladderLength("hit", "cog",list ));
    }


    @Test
    public void test02(){
        List<String> list = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log"));
        assertEquals(0, wordLadder.ladderLength("hit", "cog",list ));
    }

}