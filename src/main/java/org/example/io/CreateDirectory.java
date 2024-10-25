package org.example.io;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File dir = new File("./src/dossier");
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Directory created");
            } else {
                System.out.println("Directory not created");

            }
        }
    }
}