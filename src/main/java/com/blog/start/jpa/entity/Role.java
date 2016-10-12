package com.blog.start.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
@Entity
public class Role {


    @Id
    @GeneratedValue
    private Long id;

    private String name;


    @ManyToMany
    private List<Userj> userjs;


    public List<Userj> getUserjs() {
        return userjs;
    }

    public void setUserjs(List<Userj> userjs) {
        this.userjs = userjs;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
