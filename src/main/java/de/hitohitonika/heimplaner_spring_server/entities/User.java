package de.hitohitonika.heimplaner_spring_server.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Represents a user in the household planner system.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
}
