package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2349_Design_a_Number_Container_SystemTest {

    _2349_Design_a_Number_Container_System designANumberContainerSystem = new _2349_Design_a_Number_Container_System();


    @Test
    public void test01() {

        _2349_Design_a_Number_Container_System.NumberContainers numberContainers = designANumberContainerSystem.new NumberContainers();


        assertEquals(-1, numberContainers.find(10));
        numberContainers.change(2, 10);
        numberContainers.change(1, 10);
        numberContainers.change(3, 10);
        numberContainers.change(5, 10);
        assertEquals(1, numberContainers.find(10));
        numberContainers.change(1, 20);
        assertEquals(2, numberContainers.find(10));
    }

    @Test
    public void test02() {

        _2349_Design_a_Number_Container_System.NumberContainers numberContainers = designANumberContainerSystem.new NumberContainers();
        numberContainers.change(1, 10);
        assertEquals(1, numberContainers.find(10));
        numberContainers.change(1, 20);
        assertEquals(-1, numberContainers.find(10));
        assertEquals(1, numberContainers.find(20));
        assertEquals(-1, numberContainers.find(30));

    }

}