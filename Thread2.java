import java.io.*;
import java.util.*;
// Define a class T2 that extends Thread
class T2 extends Thread {

    // This is the method that will run when the thread starts
    public void run() {
        // Print the name of the current thread
        // Thread.currentThread() gives a reference to the currently executing thread
        // getName() gets the name of that thread (like "Thread-0", "main", etc.)
        System.out.println("current thread name: " + Thread.currentThread().getName());

        // Indicate that the run() method is being executed
        System.out.println("run() method called");
    }
}
// This is the main class that contains the main method
public class Thread2 {

    // Entry point of the Java program
    public static void main(String[] args) {

        // Create a new instance of T2 (our custom thread)
        T2 t2 = new T2();

        // Start the new thread — this runs the `run()` method of class T2
        t2.start();

        // This is printed by the main thread (not the T2 thread)
        System.out.println("hello world");
    }
}


// thread using thread class