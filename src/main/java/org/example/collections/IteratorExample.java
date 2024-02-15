package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

/*
* Java Iterator
An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
* It is called an "iterator" because "iterating" is the technical term for looping.

To use an Iterator, you must import it from the java.util package.
* */
public class IteratorExample {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        //The iterator() method can be used to get an Iterator for any collection:
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        //To loop through a collection, use the hasNext() and next() methods of the Iterator:
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Iterators are designed to easily change the collections that they loop through. The remove() method can remove
        //items from a collection while looping.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(12);
        numbers.add(4);
        numbers.add(15);
        numbers.add(8);
        numbers.add(69);

        //Use an iterator to remove numbers less than 10 from a collection:
        Iterator<Integer> it2 = numbers.iterator();

        while (it2.hasNext()){
            Integer i = it2.next();
            if(i < 10){
                it2.remove();
            }
        }
        System.out.println(numbers);

    }
}
