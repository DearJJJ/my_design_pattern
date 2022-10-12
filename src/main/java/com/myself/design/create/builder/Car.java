package com.myself.design.create.builder;

public class Car {
    private String seats;

    private String engine;

    private String tripComputer;

    private String gps;

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats='" + seats + '\'' +
                ", engine='" + engine + '\'' +
                ", tripComputer='" + tripComputer + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
