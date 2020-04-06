package com.example.learningspi.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Robot {

    void sayHello();

}
