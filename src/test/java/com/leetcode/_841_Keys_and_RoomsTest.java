package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _841_Keys_and_RoomsTest {


    private final _841_Keys_and_Rooms keysAndRooms = new _841_Keys_and_Rooms();

    @Test
    public void test01() {

        List<List<Integer>> lists = null;

        assertFalse(keysAndRooms.canVisitAllRooms(lists));

    }


    @Test
    public void test02() {

        List<List<Integer>> lists = new ArrayList<>();

        assertFalse(keysAndRooms.canVisitAllRooms(lists));

    }

    @Test
    public void test03() {

        List<List<Integer>> lists = new ArrayList<>(
                List.of(
                        List.of(1),
                        List.of(2),
                        List.of(3),
                        List.of(0)
                ));

        assertTrue(keysAndRooms.canVisitAllRooms(lists));

    }


    @Test
    public void test04() {

        List<List<Integer>> lists = new ArrayList<>(
                List.of(
                        List.of(1, 3),
                        List.of(3, 0, 1),
                        List.of(2),
                        List.of(0)
                ));

        assertFalse(keysAndRooms.canVisitAllRooms(lists));

    }


    @Test
    public void test05() {

        List<List<Integer>> lists = new ArrayList<>(
                List.of(
                        List.of(11),
                        List.of(10),
                        List.of(9),
                        List.of(8),
                        List.of(7),
                        List.of(6),
                        List.of(0),
                        List.of(5),
                        List.of(4),
                        List.of(3),
                        List.of(2),
                        List.of(1)
                ));

        assertTrue(keysAndRooms.canVisitAllRooms(lists));

    }


    @Test
    public void test06() {

        List<List<Integer>> lists = new ArrayList<>(
                List.of(
                        List.of(11),
                        List.of(10),
                        List.of(9),
                        List.of(8),
                        List.of(7),
                        List.of(11),
                        List.of(0),
                        List.of(5),
                        List.of(4),
                        List.of(3),
                        List.of(2),
                        List.of(1)
                ));

        assertFalse(keysAndRooms.canVisitAllRooms(lists));

    }


}