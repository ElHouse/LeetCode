package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _19_Roads_and_LibrariesTest {
    _19_Roads_and_Libraries roadsAndLibraries = new _19_Roads_and_Libraries();

    @Test
    public void test01(){
        List<List<Integer>> cities = new ArrayList<>();

        cities.add(List.of(1,2));
        cities.add(List.of(3,1));
        cities.add(List.of(2,3));

        assertEquals(4, roadsAndLibraries.roadsAndLibraries(3, 2, 1, cities));
    }


    @Test
    public void test02(){
        List<List<Integer>> cities = new ArrayList<>();

        cities.add(List.of(1,3));
        cities.add(List.of(3,4));
        cities.add(List.of(2,4));
        cities.add(List.of(1,2));
        cities.add(List.of(2,3));
        cities.add(List.of(5,6));

        assertEquals(12, roadsAndLibraries.roadsAndLibraries(6, 2, 5, cities));
    }

    @Test
    public void test03(){
        List<List<Integer>> cities = new ArrayList<>();

        cities.add(List.of(1,7));
        cities.add(List.of(1,3));
        cities.add(List.of(1,2));

        cities.add(List.of(2,3));
        cities.add(List.of(5,6));
        cities.add(List.of(6,8));

        assertEquals(14, roadsAndLibraries.roadsAndLibraries(7, 2, 3, cities));
    }


    @Test
    public void test04(){
        List<List<Integer>> cities = new ArrayList<>();

        cities.add(List.of(1,2));
        cities.add(List.of(1,3));
        cities.add(List.of(1,4));

        assertEquals(15, roadsAndLibraries.roadsAndLibraries(5, 6, 1, cities));
    }

    @Test
    public void test05(){
        List<List<Integer>> cities = new ArrayList<>();


        assertEquals(30, roadsAndLibraries.roadsAndLibraries(5, 6, 1, cities));
    }
}