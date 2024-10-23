package org.example.poo;

public class Product {

    protected int id;
    protected String name;

    public Product(int id) {
        this.id = id;
    }

    public Product() {
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void quiSuisJe(){
        System.out.println("Je suis un Product");
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
