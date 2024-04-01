package de.hitohitonika.heimplaner_spring_server.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Represents a task in the household planner system.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    /**
     * The name of the task.
     */
    private String name;

    /**
     * The deadline for the task.
     */
    private LocalDateTime deadline;

    /**
     * The user assigned to the task.
     */
    private User assignedUser;

    /**
     * The cycle interval for the task.
     * 0 means no repetition.
     */
    private int cycle;

    /**
     * The status of the task.
     * True if the task is completed, false otherwise.
     */
    private boolean status;

    /**
     * The priority of the task.
     */
    private int priority;

    /**
     * The description of the task.
     */
    private String description;
}
