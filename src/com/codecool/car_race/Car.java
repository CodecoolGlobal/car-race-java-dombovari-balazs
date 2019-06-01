package com.codecool.car_race;
/*
*
Car // If there is a broken down Truck on the track, then limit the max speed of cars to 75 km/h.
 normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
 *
 name // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and
 pick 2 randomly for each instance.
 *
 distanceTraveled // holds the summarized distance traveled in the race.
 *
 prepareForLap(Race race) // setup the actual speed used for the current lap
 *
 moveForAnHour() // The vehicle travels for an hour. It increases the distance traveled.
 Call this from the Race::simulateRace() only!
*
* */
// If there is a broken down Truck on the track, then limit the max speed of cars to 75 km/h.
public class Car  extends  Vechicle{
    private int normalSpeed = 100;

    @Override
    public int moveForAnHour() {
        return 0;
    }

    @Override
    public int prepareForLap(Race race) {
        return 0;
    }

}
