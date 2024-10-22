package org.example.readFromConsole;

import java.util.Scanner;

public class ReadFromConsole {

    public static void getReadWrite() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Le nombre saisi est : " + number);
        System.out.println("Donnez moi votre nom  : ");
        String nom = scanner.next();
        System.out.println("Votre nom est : " + nom);
        scanner.close();

    }


}
