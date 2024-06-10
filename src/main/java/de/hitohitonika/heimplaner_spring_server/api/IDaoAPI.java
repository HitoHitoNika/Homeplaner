package de.hitohitonika.heimplaner_spring_server.api;

import de.hitohitonika.heimplaner_spring_server.entities.User;

import java.util.List;

public interface IDaoAPI<T>{
    void insert(T entity);
    void update(T entity);
    void delete(T entity);
    List<T> getAll();
    T getById(long id);

    List<T> getByUser(User user);
}
