package com.example.travelplanner.model;

import java.sql.Time;
import java.time.LocalDate;


public class Activity {
    private int id;
    private String name;
    private LocalDate date;
    private String location;
    private int price;
    private Time duration;

    public Activity(int id, String name, LocalDate date, String location, int price, Time duration) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.location = location;
        this.price = price;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Activity [id=" + id + ", name=" + name + ", date=" + date + ", location=" + location + ", price="
                + price + ", duration=" + duration + "]";
    }

    

    
}
