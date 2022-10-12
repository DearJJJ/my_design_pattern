package com.myself.design.create.builder;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(String seats) {
        car.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    public Car getProduct() {
        Car car = this.car;
        this.reset();

        return car;
    }
}
