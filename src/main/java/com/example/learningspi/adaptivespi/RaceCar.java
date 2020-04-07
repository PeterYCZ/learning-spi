package com.example.learningspi.adaptivespi;

public class RaceCar implements Car {

    private Wheel wheel;

    RaceCar(Wheel wheel){
        this.wheel = wheel;
    };

    @Override
    public Wheel getWheel() {
        return this.wheel;
    }
}
