package com.myself.design.create.builder;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getProduct();

        System.out.println(car);
    }
}
