package com.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _133_Clone_GraphTest {


    private final _133_Clone_Graph cloneGraph = new _133_Clone_Graph();

    @Test
    public void case1() {

        _133_Clone_Graph.Node n1 = new _133_Clone_Graph.Node(1, null);
        _133_Clone_Graph.Node n2 = new _133_Clone_Graph.Node(2, null);
        _133_Clone_Graph.Node n3 = new _133_Clone_Graph.Node(3, null);
        _133_Clone_Graph.Node n4 = new _133_Clone_Graph.Node(4, null);

        List<_133_Clone_Graph.Node> v1 = new ArrayList<>();
        v1.add(n2);
        v1.add(n4);
        n1.neighbors = v1;

        List<_133_Clone_Graph.Node> v2 = new ArrayList<>();
        v2.add(n1);
        v2.add(n3);
        n2.neighbors = v2;

        List<_133_Clone_Graph.Node> v3 = new ArrayList<>();
        v3.add(n2);
        v3.add(n4);
        n3.neighbors = v3;

        List<_133_Clone_Graph.Node> v4 = new ArrayList<>();
        v4.add(n1);
        v4.add(n3);
        n4.neighbors = v4;

        assertEquals(n1.toString(), cloneGraph.cloneGraph(n1).toString());

    }


    @Test
    public void case2() {

        _133_Clone_Graph.Node n1 = new _133_Clone_Graph.Node(1, null);
        _133_Clone_Graph.Node n2 = new _133_Clone_Graph.Node(2, null);
        _133_Clone_Graph.Node n3 = new _133_Clone_Graph.Node(3, null);
        _133_Clone_Graph.Node n4 = new _133_Clone_Graph.Node(4, null);

        List<_133_Clone_Graph.Node> v1 = new ArrayList<>();
        v1.add(n2);
        v1.add(n4);
        v1.add(n3);
        n1.neighbors = v1;

        List<_133_Clone_Graph.Node> v2 = new ArrayList<>();
        v2.add(n1);
        v2.add(n3);
        n2.neighbors = v2;

        List<_133_Clone_Graph.Node> v3 = new ArrayList<>();
        v3.add(n2);
        v3.add(n4);
        v3.add(n1);
        n3.neighbors = v3;

        List<_133_Clone_Graph.Node> v4 = new ArrayList<>();
        v4.add(n1);
        v4.add(n3);
        n4.neighbors = v4;

        assertEquals(n1.toString(), cloneGraph.cloneGraph(n1).toString());

    }

    @Test
    public void case3() {

        _133_Clone_Graph.Node n1 = new _133_Clone_Graph.Node(1, null);
        _133_Clone_Graph.Node n2 = new _133_Clone_Graph.Node(2, null);
        _133_Clone_Graph.Node n3 = new _133_Clone_Graph.Node(3, null);
        _133_Clone_Graph.Node n4 = new _133_Clone_Graph.Node(4, null);

        List<_133_Clone_Graph.Node> v1 = new ArrayList<>();
        v1.add(n2);
        v1.add(n4);
        v1.add(n3);
        n1.neighbors = v1;

        List<_133_Clone_Graph.Node> v2 = new ArrayList<>();
        v2.add(n1);
        n2.neighbors = v2;

        List<_133_Clone_Graph.Node> v3 = new ArrayList<>();
        v3.add(n1);
        n3.neighbors = v3;

        List<_133_Clone_Graph.Node> v4 = new ArrayList<>();
        v4.add(n1);
        n4.neighbors = v4;

        assertEquals(n1.toString(), cloneGraph.cloneGraph(n1).toString());

    }
}