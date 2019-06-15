package com.codecool.car_race;

import java.util.*;

public class Race {
    // todo: creating List of abstrack Class is good?

    private List<Vechicle> vehicles = new ArrayList<>();


    private boolean isRaining;
    private boolean isBrokenTruck;
    private int brokenTruckTurnsLeft;


    public boolean isRaining() {
        return isRaining;
    }

    public boolean isBrokenTruck() {
        return isBrokenTruck;
    }

    public void setBrokenTruck(boolean brokenTruck) {
        isBrokenTruck = brokenTruck;
    }

    public void updateBrokenTruck() {
        isBrokenTruck = brokenTruckTurnsLeft-- > 0;
    }


    public void addVehicle(Vechicle vehicle) {
        vehicles.add(vehicle);
    }

    public void simulateRace() {
        Weather weather = new Weather();
        for (int i = 0; i < 50; i++) {


            weather.setRaining();
            isRaining = weather.isRaining();

            updateBrokenTruck();
            for (Vechicle v : vehicles) {
                v.prepareForLap(this);
                v.moveForAnHour();
            }


        }

    }

    public void printRaceResults() {

        for (Vechicle v : vehicles) {
            System.out.println(v.toString());
        }

    }

}
