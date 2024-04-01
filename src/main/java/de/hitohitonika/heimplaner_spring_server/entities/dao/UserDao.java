package de.hitohitonika.heimplaner_spring_server.entities.dao;

import de.hitohitonika.heimplaner_spring_server.entities.User;

import java.util.List;

/**
 * Data Access Object (DAO) for managing users.
 */
public class UserDao {

    /**
     * Saves a new user to the database.
     *
     * @param user The user to be saved.
     */
    public void saveUser(User user) {
        // Implementation
    }

    /**
     * Retrieves a user from the database by ID.
     *
     * @param userId The ID of the user to retrieve.
     * @return The retrieved user, or null if not found.
     */
    public User getUserById(int userId) {
        // Implementation
        return null;
    }

    /**
     * Retrieves all users from the database.
     *
     * @return A list of all users.
     */
    public List<User> getAllUsers() {
        // Implementation
        return null;
    }

    /**
     * Updates an existing user in the database.
     *
     * @param user The user to be updated.
     */
    public void updateUser(User user) {
        // Implementation
    }

    /**
     * Deletes a user from the database.
     *
     * @param userId The ID of the user to delete.
     */
    public void deleteUser(int userId) {
        // Implementation
    }
}
