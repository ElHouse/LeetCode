package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2353_Design_a_Food_Rating_SystemTest {

    private final _2353_Design_a_Food_Rating_System designAFoodRatingSystem = new _2353_Design_a_Food_Rating_System();

    @Test
    public void test01() {
        String[] foods = new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
        String[] cuisines = new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"};
        int[] ratings = new int[]{9, 12, 8, 15, 14, 7};

        _2353_Design_a_Food_Rating_System.FoodRatings foodRatings = designAFoodRatingSystem.new FoodRatings(foods, cuisines, ratings);

        assertEquals("kimchi", foodRatings.highestRated("korean"));
        assertEquals("ramen", foodRatings.highestRated("japanese"));
        foodRatings.changeRating("sushi", 16);
        assertEquals("sushi", foodRatings.highestRated("japanese"));
        foodRatings.changeRating("ramen", 16);
        assertEquals("ramen", foodRatings.highestRated("japanese"));

    }

}