package org.example.poo.datastructure;

public class SuperCar implements IVehicle{



    @Override
    public void drive() {
        System.out.println("Super Car drive");
    }

    @Override
    public void startEngine() {
        System.out.println("Super Car startEngine");
    }
}
