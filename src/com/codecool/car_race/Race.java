package com.codecool.car_race;

import java.util.*;

public class Race {
    private List<Object> motorcycles =  new ArrayList<>();

    public boolean isRaining() {
        return isRaining;
    }

    private boolean isRaining;

    public void addMotor(Motorcycle motor){
        motorcycles.add(motor);
    }

    public void simulateRace(){
        Weather weather = new Weather();
        for (int i = 0 ; i < 50 ;i ++){
            weather.setRaining();
            isRaining = weather.isRaining();
            for (Object m : motorcycles) {
                System.out.println(m.toString());
            }
        }

    }

    public void printRaceResults(){

    }

}
