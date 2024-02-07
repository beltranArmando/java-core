package org.example.notationBigO;

import java.util.ArrayList;

//O(1) constant logarithm, no matter the size of the list the execution time is always the same
//link to video as reference: https://www.youtube.com/watch?v=aR3UX2DjDXQ
public class NotationO1 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Juan");
        names.add("Pablo");
        names.add("Hector");
        names.add("Ana");
        names.add("Karla");

        String firstName = names != null && !names.isEmpty() ? names.getFirst() : "Empty List";
        System.out.println(firstName);

    }
}
