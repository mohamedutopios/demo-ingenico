package org.example.exercice.poo.tpStudent;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();

        Student student = new Student(15);
        student.sayHello();
        student.goToClasses();
        student.displayAge();

        Teacher teacher = new Teacher(40);
        teacher.sayHello();
        teacher.explain();

    }

}
