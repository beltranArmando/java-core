package org.example.threads;

public class ExtendsTread extends Thread {
    public static void main(String[] args) {
        ExtendsTread myThread = new ExtendsTread();
        myThread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run(){
        System.out.println("This code is running in a thread");
    }
}

/*
Java Threads
Threads allows a program to operate more efficiently by doing multiple things at the same time.
Threads can be used to perform complicated tasks in the background without interrupting the main program.

Creating a Thread
There are two ways to create a thread.
It can be created by extending the Thread class and overriding its run() method:

*/