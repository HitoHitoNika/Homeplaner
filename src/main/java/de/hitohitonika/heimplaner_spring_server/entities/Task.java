package de.hitohitonika.heimplaner_spring_server.entities;

import jakarta.persistence.*;
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
     * The deadline for the task.
     */
    @Column(name = "deadline")
    private LocalDateTime deadline;

    /**
     * The user assigned to the task.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_user_id")
    private User assignedUser;

    /**
     * The cycle interval for the task.
     * 0 means no repetition.
     */
    @Column(name = "cycle")
    private int cycle;

    /**
     * The status of the task.
     * True if the task is completed, false otherwise.
     */
    @Column(name = "status")
    private boolean status;

    /**
     * The priority of the task.
     */
    @Column(name = "priority")
    private int priority;

    /**
     * The description of the task.
     */
    @Column(name = "description")
    private String description;
}
