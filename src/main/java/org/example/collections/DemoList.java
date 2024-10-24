package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class DemoList {


    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Jessica");
        list.add("Michel");
        list.add("Patrick");

        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(1));
        list.set(0, "Jose");
        System.out.println(list.get(0));
        System.out.println("Size de list : " + list.size());
        list.remove(0);
        System.out.println(list.get(0));
        System.out.println("Size de list : " + list.size());

        for (String s : list) {
            System.out.println(s);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }




}
