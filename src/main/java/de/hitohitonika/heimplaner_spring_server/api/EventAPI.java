package de.hitohitonika.heimplaner_spring_server.api;

import de.hitohitonika.heimplaner_spring_server.entities.Event;
import de.hitohitonika.heimplaner_spring_server.entities.User;
import de.hitohitonika.heimplaner_spring_server.entities.dao.EventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "api/event")
public class EventAPI implements IDaoAPI<Event> {

    private final EventDao eventDao;

    @Autowired
    public EventAPI(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insert(Event entity) {
        eventDao.save(entity);
    }

    @Override
    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(Event entity) {
        eventDao.update(entity);
    }

    @Override
    @DeleteMapping(value = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void delete(Event entity) {
        eventDao.delete(entity);
    }

    @Override
    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Event> getAll() {
        return eventDao.getAll();
    }

    @Override
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Event getById(@PathVariable(name = "id") long id) {
        return eventDao.getById(id);
    }

    @Override
    @GetMapping(value = "/getEventsByParticipants")
    public List<Event> getByUser(User user) {
        return eventDao.getEventsForUser(user);
    }
}
