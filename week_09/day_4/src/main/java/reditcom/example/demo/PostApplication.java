package reditcom.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PostApplication implements CommandLineRunner {


    PostRepository PostRepository;

    @Autowired
    public PostApplication(PostRepository repository) {
        this.PostRepository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(PostApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

         PostRepository.save(new Post("first post", "I have to learn Object Relational Mapping"));

    }

}

