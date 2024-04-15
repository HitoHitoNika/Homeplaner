package de.hitohitonika.heimplaner_spring_server.entities.dao.api;

import de.hitohitonika.heimplaner_spring_server.entities.Event;
import de.hitohitonika.heimplaner_spring_server.entities.dao.EventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "api/event")
public class EventAPI implements IDaoAPI<Event> {

    private EventDao eventDao;

    @Autowired
    public EventAPI(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public void insert(Event entity) {

    }

    @Override
    public void update(Event entity) {

    }

    @Override
    public void delete(Event entity) {

    }

    @Override
    public List<Event> getAll() {
        return List.of();
    }

    @Override
    @GetMapping(name = "/{{id}}")
    public Event getById(@PathVariable(name = "id") long id) {
        return null;//eventDao.getById(id);
    }
}
