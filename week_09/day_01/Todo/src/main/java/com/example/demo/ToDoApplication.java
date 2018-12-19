package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApplication implements CommandLineRunner{

    ToDoRepository toDoRepository;

    @Autowired
    public ToDoApplication(ToDoRepository repository) {
        this.toDoRepository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ToDoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

       // toDoRepository.save(new ToDo("I have to learn Object Relational Mapping"));

    }
}

