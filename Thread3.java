// Step 1: Define a class that implements the Runnable interface
class Runnable1 implements Runnable {
    
    // Step 2: Override the run() method from the Runnable interface
    public void run() {
        // This is the task that the thread will execute
        System.out.println("thread is running");
    }
}
// Step 3: Main class to run the program
public class Thread3 {

    // Step 4: Entry point of the program
    public static void main(String[] args) {

        // Step 5: Create an object of Runnable1 (this holds the task)
        Runnable1 runnable = new Runnable1();

        // Step 6: Pass the runnable object to a Thread object
        Thread thread = new Thread(runnable);

        // Step 7: Start the thread — this will call the run() method
        thread.start();
    }
}

// implementing thread using runnable interface