package com.myself.module.adapter;

public class Test {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(12);
        RoundPeg roundPeg = new RoundPeg(11);
        System.out.println(roundHole.fits(roundPeg));

        SquarePeg squarePeg1 = new SquarePeg(12);
        SquarePeg squarePeg2 = new SquarePeg(24);
        //System.out.println(roundHole.fits(squarePeg2));

        SquarePegAdapter adapter1 = new SquarePegAdapter(squarePeg1);
        SquarePegAdapter adapter2 = new SquarePegAdapter(squarePeg2);
        System.out.println(roundHole.fits(adapter1));
        System.out.println(roundHole.fits(adapter2));

    }
}
