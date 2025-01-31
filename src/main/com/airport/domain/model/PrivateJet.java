package com.airport.domain.model;

public class PrivateJet extends Aircraft {
    private boolean hasLuxuryService;
    private String maxSpeed;

    public PrivateJet(String model, int capacity, String fuelCapacity, boolean hasLuxuryService, String maxSpeed) {
        super(model, capacity, fuelCapacity);
        this.hasLuxuryService = hasLuxuryService;
        this.maxSpeed = maxSpeed;

    }

    @Override
    public String toString() {
        return "PrivateJet{" +
                "hasLuxuryService=" + hasLuxuryService +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }
}
