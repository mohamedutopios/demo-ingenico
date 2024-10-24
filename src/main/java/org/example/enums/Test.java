package org.example.enums;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // Vous pouvez spécifier ici un chemin absolu ou relatif pour votre fichier
        String filePath = "/Users/mohamedaijjou/Documents/ingenico/java-demo/src/main/java/org/example/enums/test.txt";


        try (Scanner scanner = new Scanner(new File(filePath))) {
            // Lecture ligne par ligne du fichier
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erreur : Fichier introuvable à l'emplacement " + filePath);
        } finally {
            System.out.println("Bloc finally exécuté.");
        }
    }

}


