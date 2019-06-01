package com.codecool.car_race;

import java.util.*;

public class Race {
    private List<Object> motorcycles =  new ArrayList<Object>();

    public void addMotor(Motorcycle motor){
        motorcycles.add(motor);
    }
    public void simulateRace(){
        Weather weather = new Weather();
        for (int i = 0 ; i < 50 ;i ++){
            weather.setRaining();
            for (Object m : motorcycles) {
                System.out.println(m.toString());
            }
        }

    }
    public void printRaceResults(){

    }

}
