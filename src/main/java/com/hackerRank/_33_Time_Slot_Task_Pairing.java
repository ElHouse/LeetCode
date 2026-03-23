package com.hackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _33_Time_Slot_Task_Pairing {

    public List<Integer> findTaskPairForSlot(List<Integer> taskDurations, int slotLength) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < taskDurations.size(); i++) {

            if (map.containsKey(slotLength - taskDurations.get(i))) {
                return List.of(map.get(slotLength - taskDurations.get(i)), i);
            }
            map.put(taskDurations.get(i), i);
        }

        return List.of(-1, -1);
    }

}
