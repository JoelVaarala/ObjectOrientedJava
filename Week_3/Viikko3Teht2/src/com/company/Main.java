package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<Double>();
        numbers.add(3.3);
        numbers.add(2.2);
        numbers.add(5.0);
        numbers.add(4.7);

        System.out.println(numbers + "\n");

        MathUtils.SuurinLuku(numbers);
        MathUtils.LaskeYhteen(numbers);
        MathUtils.LaskeKeskiarvo(numbers);
    }
}
