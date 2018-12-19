package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
    List<ToDo> findAllByTitle(String a);
    List<ToDo> findByDone(Boolean b);


}
