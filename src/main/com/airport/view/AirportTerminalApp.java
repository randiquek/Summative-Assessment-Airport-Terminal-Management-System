package com.airport.view;

import com.airport.domain.model.Passenger;
import com.airport.domain.reservation.ReservationSystem;

import java.util.List;

public class AirportTerminalApp {

    public static void main(String[] args) {

        ReservationSystem system = new ReservationSystem();

        Passenger p1 = new Passenger("Joe Johnson", 123456);
        Passenger p2 = new Passenger("Jane Johnson", 654321);

        system.addReservation("AA303", p1);
        system.addReservation("AA303", p2);

        List<Passenger> passengers = system.getPassengersForFlight("AA303");
        System.out.println(passengers);
    }
}
