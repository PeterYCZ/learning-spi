package com.example.learningspi.adaptivespi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface CarMaker {
    Car makeCar(URL url);
}
