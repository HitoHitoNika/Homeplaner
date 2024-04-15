package de.hitohitonika.heimplaner_spring_server.entities.dao;

import de.hitohitonika.heimplaner_spring_server.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao implements IDao<User>{

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return List.of();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }
}
