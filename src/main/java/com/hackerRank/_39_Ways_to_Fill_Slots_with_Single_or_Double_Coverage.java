package com.hackerRank;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class _39_Ways_to_Fill_Slots_with_Single_or_Double_Coverage {


    public String countInstallationSequences(int n) {

        if (n < 0) return "0";

        Map<Integer, BigInteger> map = new HashMap<>();
        map.put(0, new BigInteger("1"));
        map.put(1, new BigInteger("1"));

        for (int i = 2; i <= n; i++) {
            map.put(i, map.get(i - 1).add(map.get(i - 2)));
        }

        return String.valueOf(map.get(n));
    }
}
