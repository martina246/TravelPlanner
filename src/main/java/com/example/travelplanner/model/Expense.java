package com.example.travelplanner.model;

import java.time.LocalDate;

public class Expense {
    private int id;
    private String category;
    private int amount;
    private String description;
    private LocalDate date;
    private String payementMethod;
    public Expense(int id, String category, int amount, String description, LocalDate date, String payementMethod) {
        this.id = id;
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.date = date;
        this.payementMethod = payementMethod;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getPayementMethod() {
        return payementMethod;
    }
    public void setPayementMethod(String payementMethod) {
        this.payementMethod = payementMethod;
    }

    
    @Override
    public String toString() {
        return "Expense [id=" + id + ", category=" + category + ", amount=" + amount + ", description=" + description
                + ", date=" + date + ", payementMethod=" + payementMethod + "]";
    }

    
}
