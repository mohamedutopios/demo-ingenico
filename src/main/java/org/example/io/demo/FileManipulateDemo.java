package org.example.io.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManipulateDemo {



    public static void main(String[] args) {

        String inputFile = "./src/employees.txt";
        String outputFile = "./src/update_employees.txt";

        List<Employee> employees = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String firtName = data[1];
                String lastName = data[2];
                String email = data[3];
                double salary = Double.parseDouble(data[4]);
                Employee employee = new Employee(id, firtName, lastName, email, salary);
                employees.add(employee);
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }


    }



}
