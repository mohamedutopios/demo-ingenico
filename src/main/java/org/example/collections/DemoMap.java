package org.example.collections;

import java.util.HashMap;

public class DemoMap {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("pierre","il fait ses courses");
        map.put("paul","il fait ses devoirs");
        map.put("jessica","elle joue au foot");
        System.out.println(map);
        System.out.println(map.get("pierre"));
        System.out.println("taille de la map : " + map.size());
        System.out.println("La clé paul est elle presente ? : " + map.containsKey("paul"));

        System.out.println("suppression : " + map.remove("jessica"));

        System.out.println(map);

    }



}
