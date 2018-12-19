/*Add a Todo class with the fields(id: long, title: String, urgent: boolean(default false), done: boolean(default false)) */
package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.security.PrivateKey;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Boolean urgent;
    private Boolean done;

    public ToDo(){
        this.urgent = false;
        this.done = false;

    }

    public ToDo(String title){
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean getUrgent() {
        return urgent;
    }

    public boolean getDone() {
        return done;
    }
}
