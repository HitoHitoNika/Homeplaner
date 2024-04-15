package de.hitohitonika.heimplaner_spring_server.entities.dao;

import de.hitohitonika.heimplaner_spring_server.entities.Event;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EventDao implements IDao<Event> {

    private final EntityManager em;

    @Autowired
    public EventDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public Event getById(int id) {
        return em.find(Event.class, id);
    }

    @Override
    public List<Event> getAll() {
        return em.createQuery("from Event", Event.class).getResultList();
    }

    @Override
    @Transactional
    public void save(Event event) {
        em.persist(event);
    }

    @Override
    @Transactional
    public void delete(Event event) {
        em.remove(event);
    }

    @Override
    public void deleteById(int id) {
        em.remove(em.find(Event.class, id));
    }

    @Override
    @Transactional
    public void update(Event event) {
        em.merge(event);
    }
}
