package org.example.stream;

import java.util.List;

public class Cart {

    List<Product> products;

    public Cart(List<Product> products) {
        this.products = products;
    }

    public Cart() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
