package com.codecool.car_race;


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

            Car car = new Car(carNames[i]);
            race.addCar(car);


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
