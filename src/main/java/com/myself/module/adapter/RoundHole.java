package com.myself.module.adapter;

public class RoundHole {
    private double radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public RoundHole() {
    }

    double getRadius() {
        return this.radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
