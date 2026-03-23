package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _35_Generate_Valid_Angle_Bracket_SequencesTest {


    _35_Generate_Valid_Angle_Bracket_Sequences generateValidAngleBracketSequences = new _35_Generate_Valid_Angle_Bracket_Sequences();


    @Test
    public void test01() {


        var response = generateValidAngleBracketSequences.generateAngleBracketSequences(2);

        response.forEach(System.out::println);

    }

}