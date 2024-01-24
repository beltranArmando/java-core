package org.example.collections;

public class ArrayExample {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "SRT"};
        cars[0] = "Toyota";
        System.out.println("printing a specific element of the array: " + cars[1]);
        //change the value of a specific element
        System.out.println("The length of the array is: " + cars.length);
        System.out.println("Printing all the cars...");
        for (String car : cars) {
            System.out.println(car);
        }

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
        /* is the same loop but with enhanced for
        for (int[] myNumber : myNumbers) {
            for (int i : myNumber) {
                System.out.println(i);
            }
        }
        */
    }
}
