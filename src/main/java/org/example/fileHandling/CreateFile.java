package org.example.fileHandling;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

/*
* To create a file in Java, you can use the createNewFile() method. This method returns a boolean value: true if the file
* was successfully created, and false if the file already exists. Note that the method is enclosed in a try...catch block.
* This is necessary because it throws an IOException if an error occurs (if the file cannot be created for some reason):
* */
public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

/*
To create a file in a specific directory (requires permission), specify the path of the file and use double backslashes
to escape the "\" character (for Windows). On Mac and Linux you can just write the path, like: /Users/name/filename.txt

Example
    File myObj = new File("C:\\Users\\MyName\\filename.txt");
* */
