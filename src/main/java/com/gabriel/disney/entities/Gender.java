package com.gabriel.disney.entities;

import javax.naming.Name;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genders")
public class Gender {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    //private image;
    private String asociatedMovies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
