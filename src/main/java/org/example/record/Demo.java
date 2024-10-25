package org.example.record;

public class Demo {
    public static void main(String[] args) {

        Person person = new Person("Michel", "Apeupres", 56);

        System.out.println(person.age());
        System.out.println(person.firstName());


        Product product = new Product(1,"iphone",1200.90);
        double total = product.totalValueStock();

    }
}
