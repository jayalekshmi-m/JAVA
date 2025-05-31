// Define a class that implements the Runnable interface
class ThreadRunnable implements Runnable {

    // Declare start and end of the range
    private int start;
    private int end;

    // Constructor to initialize start and end values
    public ThreadRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // This is the method that will run in the thread
    public void run() {
        System.out.println("Prime numbers from " + start + " and " + end + ":");

        // Loop from start to end and check for prime numbers
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) { // Check if the number is prime
                System.out.println(i + " "); // Print if it's prime
            }
        }
    }

    // Helper method to check if a number is prime
    boolean isPrime(int n) {
        if (n <= 1)
            return false; // 0 and 1 are not prime

        // Only check divisors up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false; // Not prime if divisible by any number
        }

        return true; // It's a prime number
    }
}
// Main class that runs the program
public class Thread_prime2 {

    public static void main(String[] args) {
        int start = 10; // Start of range
        int end = 50;   // End of range

        // Create a Runnable object
        ThreadRunnable prime = new ThreadRunnable(start, end);

        // Create a Thread object and pass the Runnable to it
        Thread thread = new Thread(prime);

        // Start the thread, which will call the run() method
        thread.start();
    }
}


// prime no in a certain range using runnable interface.