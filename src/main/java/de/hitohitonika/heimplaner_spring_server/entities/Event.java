package de.hitohitonika.heimplaner_spring_server.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents an event, such as a birthday or any other general occurrence, in the given household.
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Event")
public class Event {
    /**
     * The unique identifier for the event.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private long id;

    /**
     * The name or title of the event.
     */
    @Column(name="name",nullable = false)
    private String name;

    /**
     * The start date and time of the event.
     */
    @Column(name = "Start",nullable = false)
    private LocalDateTime startDate;

    /**
     * The end date and time of the event.
     */
    @Column(name = "End",nullable = false)
    private LocalDateTime endDate;

    /**
     * The ID of the owning Household, if null this is not an Household Task
     */
    @Column(name = "Household", nullable = true)
    private int household;

    @ManyToMany
    @JoinTable(
            name = "user_event",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> participants = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;
}
