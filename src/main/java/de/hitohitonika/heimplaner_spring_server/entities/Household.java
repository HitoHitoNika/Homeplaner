package de.hitohitonika.heimplaner_spring_server.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents a household in the household planner system.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Household {
    /**
     * The list of members in the household.
     */
    private List<User> members;

    /**
     * The list of tasks in the household.
     */
    private List<Task> tasks;
}
