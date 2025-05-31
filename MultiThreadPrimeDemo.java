// Define a class that implements the Runnable interface to allow threading
class PrimeRunnable implements Runnable {

    // Declare the start and end of the range as private variables for encapsulation
    private int start;
    private int end;

    // Constructor to initialize the start and end values
    public PrimeRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // This method will be executed when the thread starts
    public void run() {
        // Print the name of the current thread and the range it will process
        System.out.println("\n[" + Thread.currentThread().getName() + "] Prime numbers from " + start + " to " + end + ":");

        // Loop through the range and print prime numbers
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to next line after printing primes
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) return false; // Numbers <= 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) // If divisible by any number other than 1 and itself
                return false;
        }
        return true;
    }
}
// Main class that creates and runs threads
public class MultiThreadPrimeDemo {

    public static void main(String[] args) {

        // Create first PrimeRunnable task for the range 10 to 30
        PrimeRunnable task1 = new PrimeRunnable(10, 30);

        // Create a thread and assign task1 to it, give it a name "Thread-1"
        Thread thread1 = new Thread(task1, "Thread-1");

        // Create second PrimeRunnable task for the range 31 to 50
        PrimeRunnable task2 = new PrimeRunnable(31, 50);

        // Create a thread and assign task2 to it, name it "Thread-2"
        Thread thread2 = new Thread(task2, "Thread-2");

        // Start both threads — they will run in parallel (concurrently)
        thread1.start();
        thread2.start();
    }
}


// prime no in a certain range using multi threads