package com.example.travelplanner.service;

import java.util.ArrayList;
import java.util.List;
import com.example.travelplanner.model.Trip;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class TripService {

    private List<Trip> trips = new ArrayList<>();
    private int nextId = 1;


    //metoda za prikaz svih putovanja
    public List<Trip> allTrips() {
        return trips;
    }

    //metoda za pronalaženje jednog putovanja po ID-u
    public Trip getTrip(int id) {
        for (int t = 0; t < trips.size(); t++) {
            if (trips.get(t).getId() == id) {
                return trips.get(t);
            }
        } return null;
    }

    //metoda za dodavanje novog putovanja
    public void addNewTrip(Trip trip) {
        trip.setId(nextId);
        nextId++;

        trips.add(trip);
    }

    //metoda za izmenu postojećeg putovanja
    public void updateTrip(Trip updatedTrip) {
        for (int t = 0; t < trips.size(); t++) {
            if (trips.get(t).getId() == updatedTrip.getId()) {
                trips.set(t, updatedTrip);
                return;
            }
        }
    }


    //Metodu za brisanje putovanja
    public void deleteTrip(int id) {
        for (int t = 0; t < trips.size(); t++) {
            if (trips.get(t).getId() == id) {
                trips.remove(t);
                return;
            }
        }
    }

}
