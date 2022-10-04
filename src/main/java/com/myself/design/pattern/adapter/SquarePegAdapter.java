package com.myself.design.pattern.adapter;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }
}
