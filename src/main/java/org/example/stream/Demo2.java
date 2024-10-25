package org.example.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo2 {


    public static void main(String[] args) {

        System.out.println(" --- Demo : Filter, map et collect --- ");

        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("iPhone",1000, 123456),
                new Product("table",500, 109876),
                new Product("PC",900, 103056),
                new Product("SSD",100, 109456),
                new Product("PS5",600, 193436)
        ));

        List<Product> filtered = products
                .stream()
                .filter(product -> product.getReference()>109876)
                .map(product -> {
                    product.setPrice(product.getPrice()*1.20);
                    return product;
                })
                .toList();

        filtered.forEach(s -> System.out.println(s) );


        System.out.println(" --- Demo : toMap");

        Cart cart = new Cart();
        Cart cart1= new Cart();
        Cart cart2 = new Cart();

        cart.setProducts(Arrays.asList(products.get(0)));
        cart1.setProducts(Arrays.asList(products.get(1),products.get(2)));
        cart2.setProducts(Arrays.asList(products.get(3),products.get(4)));

        List<Cart> carts = Arrays.asList(cart,cart1,cart2);

        Product[] productArray = carts
                .stream()
                .flatMap(c -> c.getProducts()
                        .stream())
                .filter(product -> product.getReference()>109876)
                .map(product -> {
                    product.setPrice(product.getPrice()*1.50);
                    return product;
                }).toArray(Product[]::new);

        for (Product product : productArray) {
            System.out.println(product);
        }

        System.out.println("-- toMap : ");

        Map<String, Product> map = products
                .stream()
                .collect(Collectors
                        .toMap(Product::getName, Function.identity()));

        System.out.println(map);

    }





}
