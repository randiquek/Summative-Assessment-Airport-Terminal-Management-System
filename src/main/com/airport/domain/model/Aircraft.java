package com.airport.domain.model;

public class Aircraft {
    private String model;
    private int capacity;
    private String fuelCapacity;

    public Aircraft(String model, int capacity, String fuelCapacity) {
        this.model = model;
        this.capacity = capacity;
        this.fuelCapacity = fuelCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(String fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", fuelCapacity='" + fuelCapacity + '\'' +
                '}';
    }
}
