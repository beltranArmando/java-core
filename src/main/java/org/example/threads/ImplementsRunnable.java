package org.example.threads;

public class ImplementsRunnable implements Runnable{
    public static void main(String[] args){
        ImplementsRunnable implementsRunnable = new ImplementsRunnable();
        Thread thread = new Thread(implementsRunnable);
        thread.start();
        for(int i=0; i < 991999; i++){
            if(i == 991998){
                System.out.println("This code is outside of the thread");

            }
        }
    }

    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

/*
* Another way to create a thread is to implement the Runnable interface:
*
* Running Threads
If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:
*
* If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a
* Thread object's constructor and then calling the thread's start() method:
*
* Differences between "extending" and "implementing" Threads

The major difference is that when a class extends the Thread class, you cannot extend any other class,
* but by implementing the Runnable interface, it is possible to extend from another class as well,
* like: class MyClass extends OtherClass implements Runnable.
* */