package com.example.learningspi.adaptivespi;

import org.apache.dubbo.common.URL;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        AdaptiveWheelMaker adaptiveWheelMaker = new AdaptiveWheelMaker();

        Map<String,String> paramters = new HashMap<>();
        paramters.put("Wheel.maker","MichelinWheelMaker");

        URL url = new URL("dubbo","127.0.0.1",20883,"services",paramters);
        RaceCarMaker raceCarMaker = new RaceCarMaker();
        raceCarMaker.setWheelMaker(adaptiveWheelMaker);
        Car raceCar = raceCarMaker.makeCar(url);
        System.out.println(raceCar.getWheel());
    }
}
