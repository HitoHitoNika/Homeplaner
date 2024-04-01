package de.hitohitonika.heimplaner_spring_server.entities;

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
public class User {
    /**
     * The name of the user.
     */
    private String name;

    /**
     * The birthday of the user.
     */
    private LocalDateTime birthday;
    // Other attributes and methods
}
