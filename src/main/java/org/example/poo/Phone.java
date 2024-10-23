package org.example.poo;

public class Phone extends Product{

    private int prix;

    public Phone(int id, String name, int prix2) {
        super(id, name);
        prix = prix2;
    }

    public Phone() {
    }


    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void quiSuisJe(){
        super.quiSuisJe();
        System.out.println("Je suis un Phone");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "prix=" + prix +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + prix +
                '}';
    }
}
