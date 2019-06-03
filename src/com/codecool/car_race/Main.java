package com.codecool.car_race;


import java.util.Random;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        String[] carNames = new String[]{
            "Reflect",
            "Revelation",
            "Fang",
            "Daydream",
            "Grit",
            "Ranger",
            "Inception",
            "Desire",
            "Fragment",
            "Meridian"
        };

        for(int i = 0; i < 10 ; i++){
            Motorcycle motor = new Motorcycle(i + 1);
            race.addMotor(motor);

            Random random = new Random();
            int name1 = random.nextInt(10);
            int name2 = random.nextInt(10);
            Car car = new Car(carNames[name1], carNames[name2]);
            race.addCar(car);

            Truck truck = new Truck(i + 1 + "");
            race.addTruck(truck);


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
