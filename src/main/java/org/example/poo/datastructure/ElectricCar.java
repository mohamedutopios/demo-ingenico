package org.example.poo.datastructure;

public class ElectricCar extends Engine implements IVehicle{



    @Override
    public void drive() {
        System.out.println("Electric Car Drive");
    }

    @Override
    public void startEngine() {
        System.out.println("Electric Car Start");
    }

    @Override
    public String test() {
        return "test Electric Car";
    }
}
