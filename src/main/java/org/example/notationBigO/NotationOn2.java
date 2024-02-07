package org.example.notationBigO;

import java.util.ArrayList;
import java.util.List;

// O(n^2) quadratic
//link to video as reference: https://www.youtube.com/watch?v=aR3UX2DjDXQ
public class NotationOn2 {
    public static void main(String[] args) {
        Integer[] myNumbers = {5, 10, 8, 3, 666, 1, 15, 3, 11};
        ArrayList<Integer> numbers = new ArrayList<>(List.of(myNumbers));

        for (Integer number : numbers) {
            System.out.println(number);
        }

        //bubble Sort O(n^2)
        for(int i = 0; i < numbers.size() - 1; i++){
            for (int j = 0; j < numbers.size() - i - 1; j++){
                if (numbers.get(j) > numbers.get(j + 1)){
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }

        System.out.println("Ordered List: " + numbers);
    }
}
