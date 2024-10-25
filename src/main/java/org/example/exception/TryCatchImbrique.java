package org.example.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchImbrique {

    public static void main(String[] args) {
        try{
            int result = 20/2;
            System.out.println(result);
            try {
                Scanner scanner = new Scanner(new File("./src/totoi.txt"));
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Exception file note found : " + e.getMessage());
            }
        }catch (ArithmeticException e){
            System.out.println("arithmetic " + e.getMessage());
        } finally {
            System.out.println("Fin");
        }


    }


}
