package com.codecool.car_race;

/*
*  Speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly).
*  Doesn't care about trucks.
*
* */

public class Motorcycle extends Vechicle {
    private int motorcycleNumber;
    private int speed = 100;

    Motorcycle(int motorcycleNumber){
        this.motorcycleNumber = motorcycleNumber;
        this.setName("Motorcycle " + motorcycleNumber);
    }

    public int getMotorcycleNumber() {
        return motorcycleNumber;
    }

    public void setMotorcycleNumber(int motorcycleNumber) {
        this.motorcycleNumber = motorcycleNumber;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name=" + this.getName() +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int moveForAnHour() {

        return 0;
    }

    @Override
    public int prepareForLap(Race race) {
        return 0;
    }
}
