package org.example.io;

import java.io.File;

public class ListFilesExample {
    public static void main(String[] args) {

        File folder = new File("./src");
        File[] listOfFiles = folder.listFiles();

        if(listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    System.out.println("File : " + file.getName());
                }else{
                    System.out.println("Directory : " + file.getName());
                }
            }
        }

    }
}

