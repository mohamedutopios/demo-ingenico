package org.example.string;

import java.util.Arrays;

public class ChaineCaractere {

    public static void getMethodString() {
    String s = " hello ";
        System.out.println("s.length() " + s.length() ); // donne la longueur d'un tableau
        System.out.println("s.contains() " + s.contains("he"));
        System.out.println("s.uppercase() : " + s.toUpperCase());
        System.out.println("s.startWith() " + s.startsWith( " he" ));
        System.out.println("s.endWith() " + s.endsWith( "llo " ));
        System.out.println("s.replace() "  + s.replace( "ll", "LL" ));
        System.out.println("s.trim() " + s.trim());
        System.out.println("s.substring() " + s.substring(1,4));
        System.out.println("Arrays.toString(s.toCharArray()) ) : " + Arrays.toString(s.toCharArray()));
        System.out.println("s.charAt() : " + s.charAt(1));
        System.out.println("Arrays.toString(s.split()) " + Arrays.toString(s.split("e")));

    }

    public static void getComparaisonString() {

        String s = " hello ";
        String s2 = " hello ";

        System.out.println("s == s2 " + (s == s2));

        String s3 = new String(" hello ");

        System.out.println("s == s3 " + (s == s3));

        System.out.println("s.equals(s3) " + (s.equals(s3)));

        String s4 = "Jessica";
        String s5 = "jessica";

        System.out.println("s4.equals(s5) " + (s4.equals(s5)));

        System.out.println("s4.equalsIgnoreCase(s5) " + (s4.equalsIgnoreCase(s5)));

    }


    public static void getFormat() {


        String nom = "Alain";
        String journey = "Morning";

        String phrase = "Salut %s !, good %s !";

        String formattage = String.format(phrase, nom, journey);

        System.out.println(formattage);


    }


}
