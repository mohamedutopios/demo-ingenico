package org.example.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileWriteExample {

    public static void main(String[] args) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./src/file.txt", true));
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("Desolé pour les petits pains...");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
