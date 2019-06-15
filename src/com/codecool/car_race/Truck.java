package com.codecool.car_race;

/*
* Truck // speed: 100km/h. 5% chance of breaking down for 2 turns.

 * name // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.

 * breakdownTurnsLeft // holds how long its still broken down.

 * distanceTraveled // holds the summarized distance traveled in the race.

 * prepareForLap(Race race) // setup the actual speed used for the current lap

 * moveForAnHour() // The vehicle travels for an hour.
 It increases the distance traveled.
 all this from the Race::simulateRace() only!
*
* */

import java.util.Random;

public class   Truck extends Vechicle{
    private int breakdownTurnsLeft;


    public Truck(String name) {
        this.setNormalSpeed(100);
        this.setName(name);
    }

    @Override
    public void moveForAnHour() {
        if (breakdownTurnsLeft ==  0)
            this.setDistanceTraveled(this.getDistanceTraveled() + this.getNormalSpeed());
        else
            breakdownTurnsLeft -= 1;

    }

    @Override
    public void prepareForLap(Race race) {
        Random random = new Random();
        int chance = random.nextInt(100);
        if (breakdownTurnsLeft > 0) race.setBrokenTruck(true);
        else if(chance < 5) breakdownTurnsLeft = 2; // todo: ask the owner if the truck can broke down
        //  if it's already broken down

    }


}
