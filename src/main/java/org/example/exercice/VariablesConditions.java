package org.example.exercice;

import java.util.Scanner;

public class VariablesConditions {
    public static void solutionExo22() {
        int nombre = 0;
        int carre = 0;
        System.out.println("Merci de saisir le nombre à calculer :");
        Scanner s = new Scanner(System.in);
        nombre = s.nextInt();
        carre = nombre * nombre;
        System.out.print("Le carre du nombre" + " " + nombre + " " + "est" + " " + carre + ".");
    }

    public  static void solutionExo23() {
        String nom = " ";
        System.out.println("Machine : Quel est votre prénom?");
        Scanner s = new Scanner(System.in);
        nom = s.next();
        System.out.print("Utilisateur :" + " " + nom + " " + "\nMachine : Bonjour," + " " + nom + "!");
    }


    public static void solutionExo24() {
        int prix = 0;
        int nombre = 0;
        float taux = 0;
        double total = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Quel est le prix de l'article HT?");
        prix = s.nextInt();
        System.out.println("Quel est le taux de TVA (exemple 3 pour 3%) ?");
        taux = s.nextFloat();
        System.out.println("Quel est le nombre d'article?");
        nombre = s.nextInt();
        total = (prix * (1 + (taux/100))) * nombre;
        System.out.print("La prix total pour le produit au prix de" + " " + prix + " " + "euros HT, avec un taux de TVA de" + " " + taux +"% et une quantité de" + " " +  nombre + " " + "est de :" + " " + total +" "+"euros.");
    }


    public static void solutionExo31() {
        int nombre = 0;
        System.out.println("Merci de saisir le nombre :");
        Scanner s = new Scanner(System.in);
        nombre = s.nextInt();
        if (nombre < 0) {
            System.out.print("Le nombre" + " " + nombre + " " + "est négatif.");
        } else {
            System.out.print("Le nombre" + " " + nombre + " " + "est positif.");
        }
    }


    public static void solutionExo32() {
        int nombre1 = 0;
        int nombre2 = 0;
        System.out.println("Merci de saisir le premier nombre :");
        Scanner s = new Scanner(System.in);
        nombre1 = s.nextInt();
        System.out.println("Merci de saisir le second nombre :");
        //Scanner s1 = new Scanner(System.in);
        nombre2 = s.nextInt();

        if ((nombre1 < 0 && nombre2 < 0 ) || (nombre1 > 0 && nombre2 > 0)) {
            System.out.print("Le produit de" + " " + nombre1 + " " + "et de" + " " + nombre2 + " " + "est positif ");
        } else {
            System.out.print("Le produit de" + " " + nombre1 + " " + "et de " + " " + nombre2 + " " + "est negatif ");

        }

    }
}
