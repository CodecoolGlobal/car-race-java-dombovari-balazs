package com.codecool.car_race;

import java.util.Random;


/*
*  Speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly).
*  Doesn't care about trucks.
*
* */

public class Motorcycle extends Vechicle {

    Motorcycle(int motorcycleNumber){
        this.setName("Motorcycle " + motorcycleNumber);
        this.setNormalSpeed(100);
    }


    @Override
    public void moveForAnHour() {
        this.setDistanceTraveled(this.getDistanceTraveled() + this.getNormalSpeed());
    }

    @Override
    public void prepareForLap(Race race) {
        Random random = new Random();
        if(race.isRaining()){
            this.setNormalSpeed(100 - (random.nextInt(45) + 5) );
        }else{
            this.setNormalSpeed(100);
        }

    }
}
