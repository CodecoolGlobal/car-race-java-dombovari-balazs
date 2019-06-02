package com.codecool.car_race;

import java.util.*;

public class Race {
    private List<Vechicle> motorcycles =  new ArrayList<>();
    private List<Vechicle> cars =  new ArrayList<>();

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

    public void simulateRace(){
        Weather weather = new Weather();
        Random random = new Random();
        for (int i = 0 ; i < 50 ;i ++){

            weather.setRaining();
            isRaining = weather.isRaining();

            isBrokenTruck = random.nextBoolean(); // todo

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
        for (Vechicle v : motorcycles) {
            System.out.println(v.toString());
        }
        for (Vechicle v : cars) {
            System.out.println(v.toString());
        }
    }

}
