package com.myself.algorithm;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream.generate(Math::random).limit(10).forEach(System.out::print);
    }

}
