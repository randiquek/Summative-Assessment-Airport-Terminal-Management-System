package com.airport.domain.reservation;

import com.airport.domain.model.Passenger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReservationSystem {
    private HashMap<String, ArrayList<Passenger>> reservations;

    public ReservationSystem() {
        this.reservations = new HashMap<>();
    }
    public ReservationSystem(HashMap<String, ArrayList<Passenger>> reservations) {
        this.reservations = reservations;
    }

    public void addReservation(String flightNumber, Passenger passenger) {
        if(!reservations.containsKey(flightNumber)) {
            reservations.put(flightNumber, new ArrayList<>());
        }
        reservations.get(flightNumber).add(passenger);
    }

    public List<Passenger> getPassengersForFlight(String flightNumber) {
        if(reservations.containsKey(flightNumber)) {
            return reservations.get(flightNumber);
        }
        else {
            System.out.println("Flight number does not exist");
            return new ArrayList<>();
        }
    }
}
