package com.example.travelplanner.model;

public class Accommodation {
    private int id;
    private String name;
    private String type;
    private String address;
    private int pricePerNight;
    private double rating;
    public Accommodation(int id, String name, String type, String address, int pricePerNight, double rating) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.pricePerNight = pricePerNight;
        this.rating = rating;
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPricePerNight() {
        return pricePerNight;
    }
    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    
    @Override
    public String toString() {
        return "Accommodation [id=" + id + ", name=" + name + ", type=" + type + ", address=" + address
                + ", pricePerNight=" + pricePerNight + ", rating=" + rating + "]";
    }

    
}
