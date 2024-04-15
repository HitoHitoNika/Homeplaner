package de.hitohitonika.heimplaner_spring_server.entities.dao;

import de.hitohitonika.heimplaner_spring_server.entities.Event;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventDao implements IDao<Event> {
    @Override
    public Event getById(int id) {
        return null;
    }

    @Override
    public List<Event> getAll() {
        return List.of();
    }

    @Override
    public void save(Event event) {

    }

    @Override
    public void delete(Event event) {

    }

    @Override
    public void update(Event event) {

    }
}
