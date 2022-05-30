package com.gabriel.disney.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table (name = "movies")
public class Movie {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    //private image;
    private String title;
    private LocalDate creationDate;
    private int qualification;
    private String associateCharacters;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
