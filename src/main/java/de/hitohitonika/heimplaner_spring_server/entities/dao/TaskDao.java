package de.hitohitonika.heimplaner_spring_server.entities.dao;

import de.hitohitonika.heimplaner_spring_server.entities.Task;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TaskDao implements IDao<Task> {

    private final EntityManager em;

    @Autowired
    public TaskDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public Task getById(long id) {
        return em.find(Task.class, id);
    }

    @Override
    public List<Task> getAll() {
        return em.createQuery("from Task", Task.class).getResultList();
    }

    @Override
    @Transactional
    public void save(Task task) {
        em.persist(task);
    }

    @Override
    @Transactional
    public void delete(Task task) {
        em.remove(task);
    }

    @Override
    public void deleteById(long id) {
        em.remove(em.find(Task.class, id));
    }

    @Override
    @Transactional
    public void update(Task task) {
        em.merge(task);
    }
}

