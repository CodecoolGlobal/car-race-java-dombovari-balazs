package com.codecool.car_race;

public abstract class Vechicle {
    private String name;
    private int distanceTraveled;

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int moveForAnHour();
    public abstract int prepareForLap(Race race);


}
