package org.example.poo.datastructure;

public class ElectricCar extends Engine implements IVehicle{


    public ElectricCar() {
        super();
    }

    public ElectricCar(String name, String couleur, int nbreRoue) {
        super();
        this.name = name;
        this.couleur = couleur;
        this.nbreRoue = nbreRoue;
    }

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
