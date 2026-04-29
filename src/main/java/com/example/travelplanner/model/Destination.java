package com.example.travelplanner.model;

public class Destination {
    private int id;
    private String country;
    private String city;
    private String description;

    public Destination(int id, String country, String city, String description) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Destination [id=" + id + ", country=" + country + ", city=" + city + ", description=" + description
                + "]";
    }

    
}
