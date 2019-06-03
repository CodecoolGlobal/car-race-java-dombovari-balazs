package com.codecool.car_race;

import java.util.*;

public class Race {
    // todo: creating List of abstrack Class is good?
    private List<Vechicle> motorcycles =  new ArrayList<>();
    private List<Vechicle> cars =  new ArrayList<>();
    private List<Vechicle> trucks =  new ArrayList<>();

    private boolean isRaining;
    private boolean isBrokenTruck;


    public boolean isRaining() {
        return isRaining;
    }

    public boolean isBrokenTruck() {
        return isBrokenTruck;
    }

    public void setBrokenTruck(boolean brokenTruck) {
        isBrokenTruck = brokenTruck;
    }

    public void addMotor(Motorcycle motor){
        motorcycles.add(motor);
    }
    public void addCar(Car car){
        cars.add(car);
    }
    public void addTruck(Truck truck){
        trucks.add(truck);
    }

    public void simulateRace(){
        Weather weather = new Weather();
        for (int i = 0 ; i < 50 ;i ++){

            weather.setRaining();
            isRaining = weather.isRaining();

            isBrokenTruck = false; // todo

            //todo: fixing 3 for loop thing in simulating
            for (Vechicle v : trucks) {
                v.prepareForLap(this);
                v.moveForAnHour();
            }
            for (Vechicle v : motorcycles) {
                v.prepareForLap(this);
                v.moveForAnHour();
            }
            for (Vechicle v : cars) {
                v.prepareForLap(this);
                v.moveForAnHour();
            }


        }

    }

    public void printRaceResults(){
        //todo: fixing 3 for loop thing in printing

        for (Vechicle v : motorcycles) {
            System.out.println(v.toString());
        }
        for (Vechicle v : cars) {
            System.out.println(v.toString());
        }for (Vechicle v : trucks) {
            System.out.println(v.toString());
        }
    }

}
