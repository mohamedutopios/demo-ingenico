package org.example.variables;

public class Variable {


    public static void getVariable(){

        byte b = 'A';
        System.out.println(" valeur de b " + b);
        b = 126;
        System.out.println(" valeur de b " + b);
        short s = 127;
        s = 2000;
        System.out.println(" valeur de short s :  " + s);
        int i = 12798765;
        System.out.println(" valeur de int i :  " + i);
        long l = 4L;
        System.out.println(" valeur de long l :  " + l);
        char c = 'A';
        System.out.println(" valeur de char c :  " + c);
        boolean bool = true;
        System.out.println(" valeur de boolean bool :  " + bool);
        float f = 1.14F;
        System.out.println(" valeur de float f :  " + f);
        long l2 = 654322114L;
        System.out.println(" valeur de long l2 :  " + l2);
        double d = 6.987654322;
        System.out.println(" valeur de double d :  " + d);

        i = s;

        System.out.println(" valeur de int i suite modif :  " + i);

        char c2 = (char) 6987765;







    }




}
