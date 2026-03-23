package com.hackerRank;

import java.util.HashSet;
import java.util.Set;

public class _40_Max_Unique_Substring_Length_in_a_Session {


    public int maxDistinctSubstringLengthInSessions(String sessionString) {
        if (sessionString == null) return 0;

        Set<Character> seen = new HashSet<>();
        int left = 0;
        int right = 1;
        int count = 0;
        seen.add(sessionString.charAt(left));

        for (; right < sessionString.length(); right++) {

            char c = sessionString.charAt(right);

            while (seen.contains(c)) {
                seen.remove(sessionString.charAt(left));
                left++;
            }

            if (c < 97 || c > 122) {
                left = right;
                left++;
                seen.clear();
            } else {
                seen.add(c);
                count = Math.max(count, right - left + 1);
            }

        }

        return count;
    }


}
