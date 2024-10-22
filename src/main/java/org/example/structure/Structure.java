package org.example.structure;

public class Structure {


    static int int1 = 100;
    static int int2 = 200;

    public static void getIfElse() {

        if(int1 > int2){
            System.out.println("int1 > int2");
        }else{
            System.out.println("int1 <= int2");
        }

    }

    public static void getIfElseIfElse() {
        if(int1 > int2){
            System.out.println("int1 > int2");
        }else if(int1 == int2){
            System.out.println("int1 == int2");
        }else{
            System.out.println("int1 < int2");
        }
    }


    public static void getSwitch() {
        String val = "toto";

        switch (val){
            case "toto":
                System.out.println("Je suis Toto");
                break;
            case "titi":
                System.out.println("Je suis titi");
                break;
            case "lili":
                System.out.println("Je suis lili");
                break;
                default:
                    System.out.println("Je ne suis personne");
                    break;
        }

    }


}
