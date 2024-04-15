package de.hitohitonika.heimplaner_spring_server.entities.dao.api;

import java.util.List;

public interface IDaoAPI<T>{
    void insert(T entity);
    void update(T entity);
    void delete(T entity);
    List<T> getAll();
    T getById(long id);
}
