package sqlcom.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


