package com.airport.domain.model;

public class CommercialAircraft extends com.airport.domain.model.Aircraft {
    private String airlineName;

    public CommercialAircraft(String model, int capacity, String fuelCapacity, String airlineName) {
        super(model, capacity, fuelCapacity);
        this.airlineName = airlineName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    @Override
    public String toString() {
        return "CommercialAircraft{" +
                "airlineName='" + airlineName + '\'' +
                '}';
    }
}

