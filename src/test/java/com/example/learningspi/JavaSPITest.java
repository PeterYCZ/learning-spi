package com.example.learningspi;

import com.example.learningspi.spi.Robot;
import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

public class JavaSPITest {

    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
}
