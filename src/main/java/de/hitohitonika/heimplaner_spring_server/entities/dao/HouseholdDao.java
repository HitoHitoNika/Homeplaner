package de.hitohitonika.heimplaner_spring_server.entities.dao;

import de.hitohitonika.heimplaner_spring_server.entities.Household;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HouseholdDao implements IDao<Household>{
    @Override
    public Household getById(int id) {
        return null;
    }

    @Override
    public List<Household> getAll() {
        return List.of();
    }

    @Override
    public void save(Household household) {

    }

    @Override
    public void delete(Household household) {

    }

    @Override
    public void update(Household household) {

    }
}
