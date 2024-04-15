package de.hitohitonika.heimplaner_spring_server.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Represents an event, such as a birthday or any other general occurrence, in the given household.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
}
