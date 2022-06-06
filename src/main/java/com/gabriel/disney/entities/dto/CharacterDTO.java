package com.gabriel.disney.entities.dto;

public class CharacterDTO {

    private long id;
    //private image;
    private String name;
    private int age;
    private double weight;
    private String history;
    private String associatedMovie;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getAssociatedMovie() {
        return associatedMovie;
    }

    public void setAssociatedMovie(String associatedMovie) {
        this.associatedMovie = associatedMovie;
    }
}
