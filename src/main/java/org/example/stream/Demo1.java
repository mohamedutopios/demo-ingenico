package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("toto",
                "aurelien", "sylvain","robert",
                "adrien","aurelie","christophe","dominique","mohamed","walter");


        System.out.println("Filter : filtre : ");
        list.stream()
                .filter(p -> p.startsWith("a"))
                .forEach(System.out::println);






    }


}
