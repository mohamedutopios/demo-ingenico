package org.example.poo.datastructure;

public class MotorCycle extends Engine implements IVehicle{


    @Override
    public String test() {
        return "test MotorCycle";
    }

    @Override
    public void drive() {
        System.out.println("drive MotorCycle");
    }

    @Override
    public void startEngine() {
        System.out.println("start MotorCycle");
    }
}
