package com.example.travelplanner.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;


public class Trip {
    private int id;
    private String title;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
    
    private double budget;
    private String destination;
    private String activity;
    private String accommodation;
    private double expense;
    private Status status;

    public enum Status {
        PLANNED,
        ACTIVE,
        COMPLETED;
    }

    public Trip() {

    }

    public Trip(int id, String title, LocalDate startDate, LocalDate endDate, double budget, Status status, String destination, String activity, String accommodation, double expense) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
        this.status = status;
        this.destination = destination;
        this.activity = activity;
        this.accommodation = accommodation;
        this.expense = expense;
    }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

     public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

     public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

     public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    @Override
    public String toString() {
        return "Trip [id=" + id + ", title=" + title + ", budget=" + budget + ", status=" + status + "]";
    }


    


}
