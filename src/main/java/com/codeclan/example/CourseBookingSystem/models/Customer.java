package com.codeclan.example.CourseBookingSystem.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")

public class Customer {

    @Column
    private String name;

    @Column
    private String town;

    @Column
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Customer() {

    }

    public Customer(String name, String town, int age, Long id) {
        this.name = name;
        this.town = town;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
