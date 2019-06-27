package com.codeclan.example.CourseBookingSystem.models;

import javax.persistence.*;

@Entity
@Table(name= "courses")

public class Course {

    @Column
    private String name;

    @Column
    private String town;

    @Column
    private int starRating;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Course() {

    }

    public Course(String name, String town, int starRating, Long id) {
        this.name = name;
        this.town = town;
        this.starRating = starRating;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
