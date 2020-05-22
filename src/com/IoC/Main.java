package com.IoC;

public class Main {
    public static void main(String[] args) {
       /* CombustionCar combustionCar =new CombustionCar();
        combustionCar.start();
        ElectricCar electricCar =new ElectricCar();
        electricCar.start();*/

        CobustionEngine cobustionEngine =new CobustionEngine();
        Car combustionCar = new Car(cobustionEngine);
        cobustionEngine.turnOn();

        ElectricEngine electricEngine =new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.start();
    }
}
