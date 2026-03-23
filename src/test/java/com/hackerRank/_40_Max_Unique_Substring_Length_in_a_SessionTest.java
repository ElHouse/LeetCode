package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _40_Max_Unique_Substring_Length_in_a_SessionTest {

    _40_Max_Unique_Substring_Length_in_a_Session maxUniqueSubstringLengthInASession = new _40_Max_Unique_Substring_Length_in_a_Session();


    @Test
    void maxDistinctSubstringLengthInSessions2() {
        assertEquals(6, maxUniqueSubstringLengthInASession.maxDistinctSubstringLengthInSessions("ab123abc123asdbwed"));


    }
    @Test
    void maxDistinctSubstringLengthInSessions() {

        assertEquals(3, maxUniqueSubstringLengthInASession.maxDistinctSubstringLengthInSessions("abcabcbb"));
        assertEquals(0, maxUniqueSubstringLengthInASession.maxDistinctSubstringLengthInSessions("*"));
        assertEquals(1, maxUniqueSubstringLengthInASession.maxDistinctSubstringLengthInSessions("aa"));
        assertEquals(6, maxUniqueSubstringLengthInASession.maxDistinctSubstringLengthInSessions("abcdef"));
        assertEquals(7, maxUniqueSubstringLengthInASession.maxDistinctSubstringLengthInSessions("abcdefabcdefgabcdef"));
        assertEquals(6, maxUniqueSubstringLengthInASession.maxDistinctSubstringLengthInSessions("ab123abc123asdbwed"));
        assertEquals(5, maxUniqueSubstringLengthInASession.maxDistinctSubstringLengthInSessions("abc*abc*abc*abqweqrtt"));

    }
}