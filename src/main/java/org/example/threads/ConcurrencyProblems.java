package org.example.threads;

/*
Because threads run at the same time as other parts of the program, there is no way to know in which order the code will run.
When the threads and main program are reading and writing the same variables, the values are unpredictable.
The problems that result from this are called concurrency problems.
*/

public class ConcurrencyProblems extends Thread{
    public static int amount = 0;

    /*A code example where the value of the variable amount is unpredictable:*/
/*
    public static void unpredictableValue(){
        ConcurrencyProblems thread = new ConcurrencyProblems();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
*/

    public static void main(String[] args) {
        //unpredictableValue();

        /*
        To avoid concurrency problems, it is best to share as few attributes between threads as possible.
        If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check
        whether the thread has finished running before using any attributes that the thread can change.
        */
        ConcurrencyProblems thread = new ConcurrencyProblems();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        // Update amount and print its value

        System.out.println("Value: " + amount);
        amount++;
        System.out.println("Value: " + amount);
    }

    public void run(){
        amount++;
    }
}
