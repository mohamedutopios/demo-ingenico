package org.example.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

    public static void main(String[] args)  {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/toto.txt"));
            String line;
            while((line = bufferedReader.readLine()) != null ){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }

    }
}
