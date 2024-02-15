package org.example.collections;

import java.util.HashMap;

/*
In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with an index number (int type). A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:
 */
public class HashMapExample {
    public static void main(String[] args){
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London1");
        capitalCities.put("England", "London2");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        //Note: key "England" is repeated so only one will be added (London2)
        System.out.println(capitalCities);
        System.out.println("the size of the hashMap is : " + capitalCities.size());

        //To access a value in the HashMap, use the get() method and refer to its key:
        System.out.println(capitalCities.get("England"));

        //To remove an item, use the remove() method and refer to the key:
        capitalCities.remove("England");
        System.out.println(capitalCities);


        //Loop through the items of a HashMap with a for-each loop.
        //
        //Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        //To remove all items, use the clear() method:
        capitalCities.clear();
        System.out.println("capitalCities HashMap is empty : " + capitalCities.isEmpty());
    }

}
