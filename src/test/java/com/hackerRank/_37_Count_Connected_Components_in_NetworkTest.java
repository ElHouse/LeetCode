package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _37_Count_Connected_Components_in_NetworkTest {
    _37_Count_Connected_Components_in_Network countConnectedComponentsInNetwork = new _37_Count_Connected_Components_in_Network();

    @Test
    void countIsolatedCommunicationGroups() {

        assertEquals(2, countConnectedComponentsInNetwork.countIsolatedCommunicationGroups(
                List.of(
                        List.of(0, 1),
                        List.of(2, 3)
                ), 4));


        assertEquals(12, countConnectedComponentsInNetwork.countIsolatedCommunicationGroups(
                List.of(
                        List.of(0, 1),
                        List.of(2, 3)
                ), 14));

    }
}