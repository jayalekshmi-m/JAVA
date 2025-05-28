// Importing necessary classes
import java.util.LinkedList;  // For using LinkedList
import java.util.Scanner;     // For reading user input

// Main class
public class RemoveLS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);          // Scanner object for input
        LinkedList<String> ls = new LinkedList<>();   // Creating a LinkedList of Strings
        int op;                                        // To store user's menu choice
        String num;                                    // To store the string input from user

        // Adding some initial elements to the LinkedList
        ls.add("apple");
        ls.add("banana");
        ls.add("grape");

        // Infinite loop for menu-driven program
        while (true) {
            // Displaying menu options
            System.out.println("1. Add");
            System.out.println("2. Remove all elements");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            op = sc.nextInt();  // Reading user's choice

            // Handling user's choice using switch-case
            switch (op) {
                // Case 1: Add a new element to the list
                case 1:
                    System.out.print("Enter element to insert: ");
                    num = sc.next();      // Read user input
                    ls.add(num);         // Add element to the LinkedList
                    break;

                // Case 2: Remove all elements from the list
                case 2:
                    ls.clear();          // Clears all elements in the list
                    System.out.println("All elements removed from list.");
                    break;

                // Case 3: Exit the program
                case 3:
                    System.exit(0);      // Terminates the program

                // Default case: Invalid input
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}

// Program to remove all the elements from a linked list