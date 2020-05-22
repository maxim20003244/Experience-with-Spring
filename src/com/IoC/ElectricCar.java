package com.IoC;

public class ElectricCar extends Car {
    private Engine engine;

    public ElectricCar(){
      super(new ElectricEngine());
    }

}
