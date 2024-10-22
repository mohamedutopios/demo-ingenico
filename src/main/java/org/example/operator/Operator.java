package org.example.operator;

import org.example.model.Maison;

import java.util.Arrays;

public class Operator {

    public static void getOperator() {
        System.out.println("*** Les operators ***");
        System.out.println(" ");

        int i = 10;
        int i2 = -10;

        int i3 = ++i;
        int i4 = i++;
        int i5 = i;
        int i6 = --i;
        int i7 = i--;
        int i8 = i;

        System.out.println(" i  : " + i);
        System.out.println(" i2  : " + i2);
        System.out.println(" i3  : " + i3);
        System.out.println(" i4  : " + i4);
        System.out.println(" i5  : " + i5);
        System.out.println(" i6  : " + i6);
        System.out.println(" i7  : " + i7);
        System.out.println(" i8  : " + i8);


    }


    public static void getExpressionType() {

        System.out.println("*** Les expressions ***");
        System.out.println(" ");

        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L;
        float f = 1.0F;
        double d = 1.0D;
        char c = 1;

        int express = b + b;
        int express2 = b + s;
        int express3 = b + i + c;
        int express4 = i + i;
        long express5 = i + l;
        float express6 = l + f;
        double express7 = l + f;

        int t = 2_000_887_697;
        int t2 = 2_000_887_697;
        int t3 = t + t2;
        System.out.println(t3);
    }

    public static void getOperatorAndComparaison(){

        int int1 = 128;
        int int2 = 128;

        System.out.println("int1 == int2 " + (int1 == int2));

        Integer int3 = 128;
        Integer int4 = 128;

        System.out.println("int3 == int4 " + (int3 == int4));

        Integer int5 = 127;
        Integer int6 = 127;

        System.out.println("int5 == int6 " + (int5 == int6));

        Integer int7 = new Integer(127);
        Integer int8 = new Integer(127);

        System.out.println("int7 == int8 " + (int7 == int8));

        Integer int9 = Integer.valueOf(128);
        Integer int10 = Integer.valueOf(128);

        System.out.println("int9 == int10 " + (int9 == int10));

        System.out.println("int9.equals(int10) " + (int9.equals(int10)));

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        System.out.println("arr1 == arr2 " + (arr1 == arr2));
        System.out.println("arr1.equals(arr2) " + (arr1.equals(arr2)));
        System.out.println("Arrays.equals(arr1,arr2) " + (Arrays.equals(arr1,arr2)));

        Maison maison = new Maison("maison1",6);
        Maison maison2 = new Maison("maison1",6);

        System.out.println("maison == maison2 " + (maison == maison2));
        System.out.println("maison.nom == maison2.nom " + (maison.nom == maison2.nom));

    }

}
