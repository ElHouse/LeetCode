package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _1436_Destination_CityTest {
    private final _1436_Destination_City destinationCity = new _1436_Destination_City();


    @Test
    public void test01() {
        List<List<String>> paths = Arrays.asList(
                Arrays.asList("London", "New York"),
                Arrays.asList("New York", "Lima"),
                Arrays.asList("Lima", "Sao Paulo")
        );

        assertEquals("Sao Paulo", this.destinationCity.destCity(paths));
    }
    @Test
    public void test02() {
        List<List<String>> paths = Arrays.asList(
                Arrays.asList("B", "C"),
                Arrays.asList("D", "B"),
                Arrays.asList("C", "A")
        );



        assertEquals("A", this.destinationCity.destCity(paths));
    }
    @Test
    public void test03() {
        List<List<String>> paths = Arrays.asList(
                Arrays.asList("A", "Z")
        );

        assertEquals("Z", this.destinationCity.destCity(paths));
    }
}