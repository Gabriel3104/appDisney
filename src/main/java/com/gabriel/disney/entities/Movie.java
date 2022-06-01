package com.gabriel.disney.entities;

import javax.persistence.*;

@Entity
@Table (name = "movies")
public class Movie {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private image;
    private String title;
    private String creationDate;
    private int qualification;
    private String associateCharacters;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public String getAssociateCharacters() {
        return associateCharacters;
    }

    public void setAssociateCharacters(String associateCharacters) {
        this.associateCharacters = associateCharacters;
    }
}
