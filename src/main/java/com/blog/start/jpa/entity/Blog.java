package com.blog.start.jpa.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */

@Entity
public class Blog {


    @Id
    @GeneratedValue
    private Long id;

    private String url;

    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Userj userj;


    @OneToMany
    @JoinColumn(name = "blog")
    private List<Item> items;


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Userj getUserj() {
        return userj;
    }

    public void setUserj(Userj userj) {
        this.userj = userj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
