package de.hitohitonika.heimplaner_spring_server.entities.dao;

import de.hitohitonika.heimplaner_spring_server.entities.Task;

import java.util.List;

/**
 * Data Access Object (DAO) for managing tasks.
 */
public class TaskDao {

    /**
     * Saves a new task to the database.
     *
     * @param task The task to be saved.
     */
    public void saveTask(Task task) {
        // Implementation
    }

    /**
     * Retrieves a task from the database by ID.
     *
     * @param taskId The ID of the task to retrieve.
     * @return The retrieved task, or null if not found.
     */
    public Task getTaskById(int taskId) {
        // Implementation
        return null;
    }

    /**
     * Retrieves all tasks from the database.
     *
     * @return A list of all tasks.
     */
    public List<Task> getAllTasks() {
        // Implementation
        return null;
    }

    /**
     * Updates an existing task in the database.
     *
     * @param task The task to be updated.
     */
    public void updateTask(Task task) {
        // Implementation
    }

    /**
     * Deletes a task from the database.
     *
     * @param taskId The ID of the task to delete.
     */
    public void deleteTask(int taskId) {
        // Implementation
    }
}

