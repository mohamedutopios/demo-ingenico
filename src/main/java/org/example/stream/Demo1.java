package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("toto",
                "aurelien", "sylvain","robert",
                "adrien","aurelie","christophe","dominique","mohamed","walter", "mohamed");

        System.out.println("Filter : filtre : ");
        list.stream()
                .filter(p -> p.startsWith("a"))
                .forEach(System.out::println);



        System.out.println("Compter : count ");

        System.out.println("Le nombre de prenom dans ma liste est de : " + list.stream()
                .filter(p -> p.startsWith("a"))
                .count());

        System.out.println("Distinct : ");

        list.stream().distinct().forEach(System.out::println);

        System.out.println("limit : ");

        list.stream().limit(3).forEach(System.out::println);

        System.out.println("sort : ");

        list.stream().sorted().forEach(System.out::println);

        System.out.println("inverse sort : ");

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        // manipulation avec Objet




    }


}
