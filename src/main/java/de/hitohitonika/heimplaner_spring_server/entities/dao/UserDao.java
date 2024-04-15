package de.hitohitonika.heimplaner_spring_server.entities.dao;

import de.hitohitonika.heimplaner_spring_server.entities.User;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDao implements IDao<User> {

    private final EntityManager em;

    @Autowired
    public UserDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public User getById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> getAll() {
        return em.createQuery("from User", User.class).getResultList();
    }

    @Override
    @Transactional
    public void save(User user) {
        em.persist(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        em.remove(user);
    }

    @Override
    public void deleteById(long id) {
        em.remove(em.find(User.class, id));
    }

    @Override
    @Transactional
    public void update(User user) {
        em.merge(user);
    }
}
