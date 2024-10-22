package org.example.exercice;


import java.util.Scanner;

public class StructureIterative {

        private static final Scanner scanner = new Scanner(System.in);

        public static void solutionExo51() {
            int nombre;
            do {
                System.out.println("Merci de saisir le nombre (entre 1 et 3) :");
                nombre = scanner.nextInt();
            } while (nombre > 3 || nombre < 1);
        }

        public static void solutionExo52() {
            int nombre4;
            do {
                System.out.println("Donnez-moi un nombre compris entre 10 et 20 :");
                nombre4 = scanner.nextInt();

                if (nombre4 > 20) {
                    System.out.println("Plus petit!");
                } else if (nombre4 < 10) {
                    System.out.println("Plus grand!");
                }
            } while (nombre4 < 10 || nombre4 > 20);
        }


        public static void getExercice53() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez un nombre de départ :");
            int nombreDepart = scanner.nextInt();

            int i = 1;
            while (i <= 10) {
                System.out.println(nombreDepart + i);
                i++;
            }
        }


    public static void solutionExo54() {
            System.out.println("Donnez-moi le nombre de départ :");
            int nombre5 = scanner.nextInt();
            for (int i = nombre5; i < nombre5 + 10; i++) {
                System.out.println(i);
            }
        }

        public static void solutionExo55() {
            System.out.println("Donnez-moi le nombre pour la table de multiplication :");
            int nombre6 = scanner.nextInt();
            System.out.println("Table de multiplication de " + nombre6);
            for (int i = 1; i <= 10; i++) {
                System.out.println(nombre6 + " X " + i + " = " + (nombre6 * i));
            }
        }

        public static void solutionExo56() {
            System.out.println("Donnez-moi un nombre de départ :");
            int nombre7 = scanner.nextInt();
            int somme = 0;
            for (int i = 0; i <= nombre7; i++) {
                somme += i;
            }
            System.out.println("Somme = " + somme);
        }

        public static void solutionExo57() {
            int max = Integer.MIN_VALUE;
            for (int i = 1; i <= 20; i++) {
                System.out.println("Entrez le nombre " + i + " :");
                int nombre8 = scanner.nextInt();
                if (nombre8 > max) {
                    max = nombre8;
                }
            }
            System.out.println("Le nombre le plus grand est : " + max);
        }

        public static void solutionExo572() {
            int max1 = Integer.MIN_VALUE;
            int numero = 0;

            for (int i = 1; i <= 20; i++) {
                System.out.println("Entrez le nombre " + i + " :");
                int nombre9 = scanner.nextInt();
                if (nombre9 > max1) {
                    max1 = nombre9;
                    numero = i;
                }
            }
            System.out.println("Le nombre le plus grand est " + max1);
            System.out.println("C'était le nombre numéro " + numero);
        }

        public static void solutionExo510() {
            int prix, achat = 0, paye;
            do {
                System.out.println("Saisir le prix (0 pour terminer) :");
                prix = scanner.nextInt();
                achat += prix;
            } while (prix != 0);

            System.out.println("Vous devez régler la somme de : " + achat + " euros");
            System.out.println("Merci de saisir le montant de votre paiement :");
            paye = scanner.nextInt();

            int remise = paye - achat;
            System.out.println("Monnaie à rendre : " + remise + " euros");

            while (remise >= 10) {
                System.out.println("10 euros");
                remise -= 10;
            }
            while (remise >= 5) {
                System.out.println("5 euros");
                remise -= 5;
            }
            while (remise >= 1) {
                System.out.println("1 euro");
                remise -= 1;
            }

        }



}
