package com.codecool.car_race;

import java.util.Random;


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
                ", distanceTraveled=" + this.getDistanceTraveled() +
                '}';
    }

    @Override
    public void moveForAnHour() {
        this.setDistanceTraveled(this.getDistanceTraveled() + this.speed);
    }

    @Override
    public void prepareForLap(Race race) {
        Random random = new Random();
        if(race.isRaining()){
            this.speed -=  random.nextInt(45) + 5;
        }else{
            this.speed = 100;
        }

    }
}
