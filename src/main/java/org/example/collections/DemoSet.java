package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Bird");
        set.add("Cat");
        set.add("Dog");
        set.add("Bird");

        System.out.println("set : " + set);

        boolean IsDog = set.contains("Dog");
        System.out.println("Dog existe ? " + IsDog);

        set.remove("Cat");
        boolean isCat = set.contains("Cat");
        System.out.println("Cat existe ? " + isCat);

        System.out.println("La taille de set : " + set.size());

        set.clear();

        System.out.println("set : " + set);

        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");

        Set<String> set2 = new HashSet<>();
        set2.add("Orange");
        set2.add("Banana");

        set1.addAll(set2);

        System.out.println("set1 : " + set1);


    }
}
