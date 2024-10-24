package org.example.poo.datastructure;

import org.example.exercice.poo.tpCompte.IExemple;

public non-sealed class PetrolCar extends Engine implements IVehicle {


    public PetrolCar(String name, int nbreRoue, String couleur) {
        super(name, nbreRoue, couleur);
    }

    public PetrolCar() {
        super();
    }

    @Override
    public void drive() {

    }

    @Override
    public void startEngine() {

    }

    @Override
    public String test() {
        return "";
    }
}
