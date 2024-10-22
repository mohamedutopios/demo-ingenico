package org.example.exercices;

import java.util.Scanner;

public class VariablesConditions2 {

    public static void solutionExo34(Scanner s3) {
        System.out.print("Merci de saisir un nombre : ");
        int nombre = s3.nextInt();

        if (nombre == 0) {
            System.out.println("Le nombre est nul");
        } else if (nombre < 0) {
            System.out.println("Le nombre est négatif");
        } else {
            System.out.println("Le nombre est positif");
        }
    }

    public static void solutionExo35(Scanner s3) {
        System.out.print("Merci de saisir l'âge de l'enfant : ");
        int age = s3.nextInt();

        if (age >= 12) {
            System.out.println("Il est dans la catégorie Cadet");
        } else if (age >= 10) {
            System.out.println("Il est dans la catégorie Minime");
        } else if (age >= 8) {
            System.out.println("Il est dans la catégorie Pupille");
        } else if (age >= 6) {
            System.out.println("Il est dans la catégorie Poussin");
        } else {
            System.out.println("L'âge est trop jeune pour une catégorie.");
        }
    }

    public static void solutionExo36(Scanner s3) {
        System.out.print("Merci de saisir un nombre entier : ");
        int nombre = s3.nextInt();

        if (nombre % 3 == 0) {
            System.out.println("Le nombre est divisible par 3.");
        } else {
            System.out.println("Le nombre n'est pas divisible par 3.");
        }
    }
    public static void solutionExo37(Scanner s3) {
        System.out.print("Merci de saisir le nombre de photocopies à réaliser : ");
        int nombre = s3.nextInt();
        double total;

        if (nombre > 20) {
            total = nombre * 0.05;
        } else if (nombre > 10) {
            total = nombre * 0.10;
        } else {
            total = nombre * 0.15;
        }

        System.out.printf("Le prix à payer est de %.2f euros%n", total);
    }


}
