package org.example.notationBigO;

import java.util.ArrayList;
import java.util.List;

// O(n) Lineal Logarithm
//link to video as reference: https://www.youtube.com/watch?v=aR3UX2DjDXQ
public class NotationOn {
    public static void main(String[] args){
        Integer[] myNumbers = {5, 10, 8, 3, 666, 1, 15, 3, 11};
        ArrayList<Integer> numbers = new ArrayList<>(List.of(myNumbers));

        // the greater the list the greater the time to print all the elements
        for(Integer number : numbers){
            System.out.println(number);
        }

        //search for the largest number in the list (same case the largest the list more time is required to finish)
        int maxNumber = numbers.getFirst();

        for (Integer number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("The largest number is: " + maxNumber);
    }
}
