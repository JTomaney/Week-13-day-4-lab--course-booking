package com.codeclan.example.CourseBookingSystem.models;

import javax.persistence.*;

@Entity
@Table(name = "bookings")

public class Booking {

    @Column
    private String date;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Booking() {

    }

    public Booking(String date, Long id) {
        this.date = date;
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
