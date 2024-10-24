package org.example.poo.generique;

public class Demo {

    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        User user = new User(1, "Jean-Michel","Apeupres");
        userRepository.save(user);

        User user2 = userRepository.findById(1);

        System.out.println(user2);


    }
}
