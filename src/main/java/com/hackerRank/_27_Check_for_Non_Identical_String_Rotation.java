package com.hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _27_Check_for_Non_Identical_String_Rotation {

    public boolean isNonTrivialRotation(String s1, String s2) {

        if(s1.equals(s2)) return false;
        if(s1.length() != s2.length()) return false;

        char fistLetter = s1.charAt(0);

        Map.Entry<Character, List<Integer>> entry = Map.entry(s2.charAt(0), new ArrayList<>());

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == fistLetter) {
                entry.getValue().add(i);
            }
        }

        for (Integer index : entry.getValue()) {

            String parte1 = s2.substring(index );
            String parte2 = s2.substring(0, index );


            if ((parte1+parte2).equals(s1)) {
                return true;
            }
        }

        return false;
    }


}
