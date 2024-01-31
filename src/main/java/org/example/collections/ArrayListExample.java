package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;

/*
* The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
* (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and
* removed from an ArrayList whenever you want. The syntax is also slightly different:
* */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(3, "not Mazda");
        cars.add(2, "between BMW and Ford");
        System.out.println(cars);
        System.out.println("The size of the arrayList is: " + cars.size());
        System.out.println("First car is: " + cars.getFirst());
        System.out.println("Second car is: " + cars.get(1));
        System.out.println("Last car is:  " + cars.getLast());
        System.out.println("Removing Ford car...");
        cars.remove(2);
        System.out.println(cars);

        System.out.println("Cleaning the arrayList...");
        cars.clear();
        System.out.println(cars);

        ArrayList<String> beers = new ArrayList<>();
        beers.add("Indio");
        beers.add("Bohemia");
        beers.add("Pacifico");
        for(String beer: beers){
            System.out.println("I like to drink a " + beer);
        }

        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(5);
        myNumbers.add(13);
        myNumbers.add(1);
        Collections.sort(myNumbers);
        System.out.println("my numbers: " + myNumbers);

    }
}
