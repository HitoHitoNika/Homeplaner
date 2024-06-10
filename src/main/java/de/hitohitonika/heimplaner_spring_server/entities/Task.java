package de.hitohitonika.heimplaner_spring_server.entities;

import de.hitohitonika.heimplaner_spring_server.enums.Cycle;
import de.hitohitonika.heimplaner_spring_server.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Represents a task in the household planner system.
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private long id;

    /**
     * The name of the task.
     */
    @Column(name = "name")
    private String name;

    /**
     * The description of the task.
     */
    @Column(name = "description")
    private String description;

    /**
     * The deadline for the task.
     */
    @Column(name = "deadline")
    private LocalDateTime deadline;

    /**
     * The cycle interval for the task.
     * Should be 0 when no repetition.
     */
    @Column(name = "cycle")
    private int cycle;

    /**
     * Describes the unit for the interval
     */
    @Column(name = "cycle_unit")
    private Cycle unit;

    /**
     * The status of the task.
     * True if the task is completed, false otherwise.
     */
    @Column(name = "status")
    private Status status;

    /**
     * The user assigned to the task.
     */
    @ManyToOne
    @JoinColumn(name = "assigned_user_id")
    private User assignedUser;

    /**
     * The priority of the task.
     */
    @Column(name = "priority")
    private int priority;

    @Column(name = "Household", nullable = true)
    private int household;
}
