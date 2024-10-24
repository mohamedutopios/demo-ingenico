package org.example.poo.datastructure;

public class MotorCycle extends Engine implements IVehicle{


    public MotorCycle(String name, int nbreRoue, String couleur) {
        super(name, nbreRoue, couleur);
    }

    public MotorCycle() {
        super();
    }

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
