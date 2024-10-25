package org.example.record;

public record Person(String lastName, String firstName, int age) {

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public int age() {
        return age;
    }
}
