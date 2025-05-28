// Step 1: Create a class that extends the Thread class
class NumberThread extends Thread {
    private int start; // Start of number range
    private int end;   // End of number range

    // Step 2: Constructor to initialize start and end values
    public NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Step 3: Override the run() method - this is the task the thread will perform
    public void run() {
        // Step 4: Print numbers from start to end
        for (int i = start; i <= end; i++) {
            // Print the current thread's name and the current number
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
        }
    }
}
// Step 5: Main class with the main() method
public class Number_thread {

    public static void main(String[] args) {
        // Step 6: Create two threads with different ranges
        NumberThread thread1 = new NumberThread(1, 5);   // Will print 1 to 5
        NumberThread thread2 = new NumberThread(6, 10);  // Will print 6 to 10

        // Step 7: Set names for each thread
        thread1.setName("thread-1");
        thread2.setName("thread-2");

        // Step 8: Start the threads (this automatically calls the run() method)
        thread1.start();
        thread2.start();
    }
}


// printing numbers in a specific range using 2 threads