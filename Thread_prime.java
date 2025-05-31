// Define a class that extends Thread to print prime numbers in a given range
class PrimeThread extends Thread {
    int start, end; // Start and end of the range

    // Constructor to initialize start and end values
    PrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // The run() method will be executed when the thread starts
    public void run() {
        System.out.println("Prime numbers from " + start + " and " + end + ":");

        // Loop through the range and print prime numbers
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) { // Call helper method to check for prime
                System.out.println(i + " ");
            }
        }
    }

    // Helper method to check if a number is prime
    boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        // Check for divisibility up to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // It's a prime number
    }
}
// Main class to run the thread
public class Thread_prime {
    public static void main(String[] args) {
        int start = 10; // Start of range
        int end = 50;   // End of range

        // Create a PrimeThread object with the given range
        PrimeThread prime = new PrimeThread(start, end);

        // Start the thread, which calls the run() method in the background
        prime.start();
    }
}


// prime no in a certain range using thread class