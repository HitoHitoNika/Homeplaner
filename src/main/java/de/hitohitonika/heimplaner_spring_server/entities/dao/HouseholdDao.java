package de.hitohitonika.heimplaner_spring_server.entities.dao;

import de.hitohitonika.heimplaner_spring_server.entities.Household;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class HouseholdDao implements IDao<Household> {

    private final EntityManager em;

    @Autowired
    public HouseholdDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public Household getById(int id) {
        return em.find(Household.class, id);
    }

    @Override
    public List<Household> getAll() {
        return em.createQuery("from Household", Household.class).getResultList();
    }

    @Override
    @Transactional
    public void save(Household household) {
        em.persist(household);
    }

    @Override
    @Transactional
    public void delete(Household household) {
        em.remove(household);
    }

    @Override
    public void deleteById(int id) {
        em.remove(em.find(Household.class, id));
    }

    @Override
    @Transactional
    public void update(Household household) {
        em.merge(household);
    }
}
