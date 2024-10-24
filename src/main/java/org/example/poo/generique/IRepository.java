package org.example.poo.generique;

public interface IRepository<T> {

    void save(T entity);
    T findById(int id);
}
