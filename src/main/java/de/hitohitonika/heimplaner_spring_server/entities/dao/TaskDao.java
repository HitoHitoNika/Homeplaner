package de.hitohitonika.heimplaner_spring_server.entities.dao;

import de.hitohitonika.heimplaner_spring_server.entities.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDao implements IDao<Task>{
    @Override
    public Task getById(int id) {
        return null;
    }

    @Override
    public List<Task> getAll() {
        return List.of();
    }

    @Override
    public void save(Task task) {

    }

    @Override
    public void delete(Task task) {

    }

    @Override
    public void update(Task task) {

    }
}

