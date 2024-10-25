package org.example.record;

public record Product(int id, String name, double price, int quantity) {

    public Product(int id, String name, double price) {
        this(id, name, price, 0);
    }

    public double totalValueStock() {
        return quantity * price;
    }




}
