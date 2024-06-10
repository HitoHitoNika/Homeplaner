package de.hitohitonika.heimplaner_spring_server.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a user in the household planner system.
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private long id;

    /**
     * The name of the user.
     */
    @Column(name = "name",nullable = false)
    private String name;

    /**
     * The birthday of the user.
     */
    @Column(name = "birthday",nullable = false)
    private LocalDateTime birthday;

    /**
     * The household id of which the user is part of
     */
    @Column(name = "Household", nullable = false)
    private int household;

    /**
     * Set of the Events the User is a Part of
     */
    @ManyToMany(mappedBy = "participants")
    private Set<Event> events = new HashSet<>();

    /**
     * Set of the Tasks the User has to do
     */
    @OneToMany(mappedBy = "assignedUser")
    private Set<Task> tasks = new HashSet<>();

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
