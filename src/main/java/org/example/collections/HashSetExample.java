package org.example.collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        //Note: In the example above, even though BMW is added twice it only appears once in the set because every item in a set has to be unique.
        //To check whether an item exists in a HashSet, use the contains() method:
        System.out.println("HashSet contains Mazda? " + cars.contains("Mazda"));
    }
}
