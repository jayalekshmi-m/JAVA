// Import required classes
import java.util.ArrayDeque;  // Provides the ArrayDeque class (a resizable array implementation of Deque)
import java.util.Deque;       // Interface for double-ended queue
import java.util.Scanner;     // For user input

// Main class
public class Dequeue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Create a Deque of Integer type using ArrayDeque implementation
        Deque<Integer> deque = new ArrayDeque<>();

        int op, num;  // Variables for menu option and user input

        // Infinite loop to display menu and perform actions repeatedly
        while (true) {
            // Display menu
            System.out.println("\n1. Add front\n2. Add rear\n3. Remove front\n4. Remove rear\n5. Display\n6. Exit");
            System.out.print("Enter your choice: ");
            op = sc.nextInt();  // Read user choice

            // Handle user choice using switch-case
            switch (op) {

                // Case 1: Add an element to the front of the deque
                case 1:
                    System.out.print("Enter number to add at front: ");
                    num = sc.nextInt();  // Read number
                    deque.addFirst(num); // Add number at front
                    break;

                // Case 2: Add an element to the rear of the deque
                case 2:
                    System.out.print("Enter number to add at rear: ");
                    num = sc.nextInt();  // Read number
                    deque.addLast(num);  // Add number at rear
                    break;

                // Case 3: Remove an element from the front of the deque
                case 3:
                    if (!deque.isEmpty()) {
                        System.out.println("Removed from front: " + deque.removeFirst());  // Remove and print
                    } else {
                        System.out.println("Deque is empty");  // Empty message
                    }
                    break;

                // Case 4: Remove an element from the rear of the deque
                case 4:
                    if (!deque.isEmpty()) {
                        System.out.println("Removed from rear: " + deque.removeLast());  // Remove and print
                    } else {
                        System.out.println("Deque is empty");  // Empty message
                    }
                    break;

                // Case 5: Display the current deque elements
                case 5:
                    System.out.println("Deque contents: " + deque);  // Print deque
                    break;

                // Case 6: Exit the program
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);  // Exit the program

                // Default case: Invalid choice
                default:
                    System.out.println("Invalid option");  // Error message
                    break;
            }
        }
    }
}

// Program to demonstrate the addition and deletion of elements in deque