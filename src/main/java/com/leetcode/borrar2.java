package com.leetcode;

import java.util.*;

public class borrar2 {

    Map<Long, Long> count(Map<String, UserStats>... visits) {

        if (visits == null || visits.length == 0) return new HashMap<>();

        Map<Long, Long> response = new HashMap<>();


        Arrays.stream(visits)
                .filter(Objects::nonNull)
                .peek(k -> k.forEach((ka, v) -> {
                    if (v != null) {
                        System.out.println(ka + "-" + v.getVisitCount().orElse(-1L));
                    }
                    ;
                }))
                .forEach((v) -> {
                    v.forEach((key, value) -> {
                        try {
                            long aux = Long.parseLong(key);
                            Long visitsAux = value.getVisitCount().orElse(-1L);
                            if (visitsAux > 0) {
                                response.put(aux, response.getOrDefault(key, 0L) + visitsAux);
                            }
                        } catch (Exception e) {
                        }
                    });
                });


        response.entrySet().forEach((k) -> {
            System.out.println(k.getKey() + "-" + k.getValue());
        });


        return response;
    }


}

class UserStats {

    private Optional<Long> visitCount;

    public Optional<Long> getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }
}