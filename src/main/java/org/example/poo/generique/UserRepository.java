package org.example.poo.generique;

public class UserRepository implements IRepository<User> {

    @Override
    public void save(User entity) {
        System.out.println("Saving user : " + entity.getNom());
    }

    @Override
    public User findById(int id) {
        return new User(id);
    }
}
