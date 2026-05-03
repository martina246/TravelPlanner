package com.example.travelplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.travelplanner.service.*;
import com.example.travelplanner.model.*;

@Controller
public class TripController {
    
    private final TripService tripService;  

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    //prikaz svih putovanja
    @GetMapping("/trips")
    public String getAllTrips(Model model) {
        model.addAttribute("trips", tripService.allTrips());

        return "trips";
    }

    //dodavanje novog putovanja
    @GetMapping("/trips/new")
    public String addNewTrip(Model model) {
        model.addAttribute("trip", new Trip());
        return "trip-form";
    }
    
    //cuva putovanje
    @PostMapping("/trips/save")
    public String saveTrip(Trip trip) {
        tripService.addNewTrip(trip);

        return "redirect:/trips";
    }

    //prikazuje detalje jednog putovanja
    @GetMapping("/trips/details/{id}")
    public String getTripDetails(@PathVariable int id, Model model) {
        Trip trip = tripService.getTrip(id);
        model.addAttribute("trip", trip);
        return "trip-details";
    }

    //otvara formu za izmenu postojeceg putovanja
    @GetMapping("/trips/edit/{id}")
    public String updateTrip(@PathVariable int id, Model model) {
        Trip trip = tripService.getTrip(id);
        model.addAttribute("trip", trip);
        return "trip-form";

    }

    //cuva izmenjeno putovanje
    @PostMapping("/trips/update")
    public String saveUpdatedTrip(Trip trip) {
        tripService.updateTrip(trip);
        return "redirect:/trips";
    }

    //brise putovanje i vraca korisnika na listu
    @GetMapping("/trips/delete/{id}")
    public String deleteTrip(@PathVariable int id) {
        tripService.deleteTrip(id);
        return "redirect:/trips";
    }

}
