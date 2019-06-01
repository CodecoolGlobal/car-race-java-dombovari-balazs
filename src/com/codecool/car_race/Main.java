package com.codecool.car_race;


import java.util.*;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        List<Object> motorcycles =  new ArrayList<Object>();
        for(int i = 0; i < 10 ; i++){
            Motorcycle motor = new Motorcycle(i + 1);
            motorcycles.add(motor);
        }
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);

        race.simulateRace();
        race.printRaceResults();
    }
}
