package com.example.learningspi.reflect;


import java.awt.*;

public class LatenReflection {
    public static void main(String[] args) throws AWTException {
        CommunicateReflectively.perform(new SmartDog());
        CommunicateReflectively.perform(new Robot());
        CommunicateReflectively.perform(new Mime());
    }


}
