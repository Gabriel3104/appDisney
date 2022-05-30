package com.gabriel.disney.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "characters")
public class Character {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    //private image;
    private String name;
    private int age;
    private double weight;
    private String history;
    private String associatedMovie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
