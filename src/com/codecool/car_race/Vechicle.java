package com.codecool.car_race;

public abstract class Vechicle {
    private String name;
    private int distanceTraveled;

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    private int normalSpeed;

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

    public abstract void moveForAnHour();
    public abstract void prepareForLap(Race race);

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name=" + this.getName() +
                ", distanceTraveled=" + this.getDistanceTraveled() +
                '}';
    }
}
