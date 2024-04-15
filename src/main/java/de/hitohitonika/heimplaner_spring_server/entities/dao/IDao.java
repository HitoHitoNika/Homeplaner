package de.hitohitonika.heimplaner_spring_server.entities.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This interface represents a generic Data Access Object (DAO) for a specific type T.
 * DAOs are used to provide an abstract interface to the database for accessing and manipulating data.
 *
 * @param <T> The type of objects handled by this DAO
 */
@Repository
public interface IDao<T> {

    /**
     * Retrieves an object of type T from the database based on its ID.
     *
     * @param id The ID of the object to retrieve
     * @return The object with the specified ID, or null if not found
     */
    T getById(int id);

    /**
     * Retrieves all objects of type T from the database.
     *
     * @return A list containing all objects of type T
     */
    List<T> getAll();

    /**
     * Saves an object of type T to the database.
     *
     * @param t The object to save
     */
    void save(T t);

    /**
     * Deletes an object of type T from the database.
     *
     * @param t The object to delete
     */
    void delete(T t);

    /**
     * Updates an object of type T in the database.
     *
     * @param t The object to update
     */
    void update(T t);
}

