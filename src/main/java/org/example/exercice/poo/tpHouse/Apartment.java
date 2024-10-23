package org.example.exercice.poo.tpHouse;

public class Apartment extends House {
    public Apartment() {
        super(50);
    }

    @Override
    public void display() {
        System.out.println("Je suis un appartement, ma surface est de " + surface + " m²");
    }

}
