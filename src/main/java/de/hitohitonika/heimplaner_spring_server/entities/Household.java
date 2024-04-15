package de.hitohitonika.heimplaner_spring_server.entities;

import jakarta.persistence.*;
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
@Entity
@Table(name = "Household")
public class Household {

    /**
     * The unique identifier for the household.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private long id;

    /**
     * The list of members belonging to the household.
     */
    @OneToMany(mappedBy = "household",fetch = FetchType.LAZY)
    private List<User> members;

    /**
     * The list of tasks associated with the household.
     */
    @OneToMany(mappedBy = "household",fetch = FetchType.LAZY)
    private List<Task> tasks;

    /**
     * The list of events associated with the household.
     */
    @OneToMany(mappedBy = "household", fetch = FetchType.LAZY)
    private List<Event> events;
}
