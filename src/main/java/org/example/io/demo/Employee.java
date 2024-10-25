package org.example.io.demo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;

    @Override
    public String toString() {
        return id + "," + firstName + "," + lastName + "," + email + "," + salary;
    }


}
