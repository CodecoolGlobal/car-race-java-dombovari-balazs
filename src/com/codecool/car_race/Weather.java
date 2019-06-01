package com.codecool.car_race;

import java.util.Random;

public class Weather {
    private boolean isRaining;

    public boolean isRaining() {
        return isRaining;
    }

    public void setRaining() {
        Random random = new Random();
        int chance = random.nextInt(100);
    }
}
