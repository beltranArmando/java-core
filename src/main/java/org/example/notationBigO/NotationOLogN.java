package org.example.notationBigO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//O(log n) logarithmic notation
//this is a binary search, we need an ordered array to do so
//link to video as reference: https://www.youtube.com/watch?v=aR3UX2DjDXQ
public class NotationOLogN {
    public static void main(String[] args) {
        Integer[] myNumbers = {5, 10, 15, 20, 25, 30, 35, 40, 45};
        ArrayList<Integer> orderedNumbers = new ArrayList<>(List.of(myNumbers));
        int element = 2;
        int position = findNumber(orderedNumbers, element);
        System.out.println("Position: " + position);

    }

    private static int findNumber(ArrayList<Integer> orderedNumbers, int element) {
        int start = 0;
        int end = orderedNumbers.size() - 1;

        int it = 0;
        System.out.println("Searching for element " + element + "...");
        while(start <= end){
            it++;

            int mid = start + (end - start) / 2;

            if(Objects.equals(orderedNumbers.get(mid), element)){
                System.out.println("Repetitions: " + it);
                return mid;
            }

            if (orderedNumbers.get(mid) < element){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
