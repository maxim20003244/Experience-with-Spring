package com.IoC;

public class ElectricEngine implements Engine {
    @Override
    public void turnOn() {
        System.out.println("Started electric engine!");
    }
}
