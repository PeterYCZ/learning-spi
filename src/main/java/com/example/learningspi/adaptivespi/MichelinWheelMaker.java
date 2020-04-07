package com.example.learningspi.adaptivespi;

import org.apache.dubbo.common.URL;

public class MichelinWheelMaker implements WheelMaker {

    @Override
    public Wheel makeWheel(URL url) {
        return new Wheel();
    }
}
