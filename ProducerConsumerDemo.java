// Shared resource between Producer and Consumer
class SharedBuffer {
    private int data;           // Data to be produced/consumed
    private boolean hasData = false; // Flag to track if buffer has data

    // Method for Producer to produce data
    public synchronized void produce(int value) {
        try {
            // If data is already produced and not yet consumed, wait
            while (hasData) {
                wait(); // Release lock and wait
            }

            // Store data in buffer
            data = value;
            System.out.println("Produced: " + data);

            // Set flag to indicate data is available
            hasData = true;

            // Notify the consumer that data is available
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method for Consumer to consume data
    public synchronized void consume() {
        try {
            // If no data is available, wait
            while (!hasData) {
                wait(); // Release lock and wait
            }

            // Read data from buffer
            System.out.println("Consumed: " + data);

            // Set flag to false after consuming
            hasData = false;

            // Notify producer that buffer is empty now
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Producer thread that generates data
class Producer extends Thread {
    SharedBuffer buffer;

    // Constructor takes shared buffer
    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i); // Produce numbers 1 to 5
        }
    }
}

// Consumer thread that consumes data
class Consumer extends Thread {
    SharedBuffer buffer;

    // Constructor takes shared buffer
    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume(); // Consume 5 values
        }
    }
}

// Main class to run the program
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        // Create shared buffer
        SharedBuffer buffer = new SharedBuffer();

        // Create Producer and Consumer threads
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        // Start both threads
        p.start();
        c.start();
    }
}

// Producer/Consumer using ITC 