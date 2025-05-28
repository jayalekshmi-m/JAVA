 // Define a class T1 that extends Thread to create a new thread
class T1 extends Thread {

    // Override the run() method to define what the thread will do
    public void run() {
        // Create a string message
        String str = "thread started running";
        
        // Print the message to the console (this runs in a separate thread)
        System.out.println(str);
    }
}

// Main class that contains the main method
public class Thread1 {

    // Main method: starting point of the program
    public static void main(String[] args) {
        
        // Create an instance of the T1 class (which is a thread)
        T1 t1 = new T1();
        
        // Start the thread: this will internally call the run() method of T1 in a separate thread
        t1.start();
        
        // This line is executed by the main thread
        System.out.println("Hello world");
    }
}


// thread execution by predefined thread class