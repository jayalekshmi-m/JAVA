// Importing necessary classes
import java.util.LinkedHashSet;  // For using LinkedHashSet
import java.util.Scanner;        // For taking user input
import java.util.Set;            // For using Set interface

// Main class
public class LinkedHS {
    public static void main(String[] args) {
        
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Creating a LinkedHashSet to store unique integers in insertion order
        Set<Integer> st = new LinkedHashSet<>();
        
        // Declaring variables
        int num, op;

        // Infinite loop to keep the menu running
        while (true) {
            // Displaying the menu options
            System.out.println("1. Add\n2. Remove\n3. Display\n4. Search\n5. Clear\n6. Exit\nEnter an option:");
            
            // Reading user choice
            op = sc.nextInt();

            // Switch statement to handle different operations
            switch(op) {
                
                // Case 1: Add an element to the set
                case 1:
                    System.out.println("Enter element to insert:");
                    num = sc.nextInt();
                    st.add(num);  // Adds the number to the set
                    break;

                // Case 2: Remove an element from the set
                case 2:
                    if (!st.isEmpty()) {  // Only if set is not empty
                        System.out.println("Enter element to remove:");
                        num = sc.nextInt();
                        st.remove(num);  // Removes the specified element
                    } else {
                        System.out.println("Set is empty!");
                    }
                    break;

                // Case 3: Display all elements in the set
                case 3:
                    System.out.println("List is: " + st);
                    break;

                // Case 4: Search for an element in the set
                case 4:
                    if (!st.isEmpty()) {  // Only if set is not empty
                        System.out.println("Enter element to search:");
                        num = sc.nextInt();
                        System.out.println("List contains " + num + ": " + st.contains(num));  // Checks for presence
                    } else {
                        System.out.println("Set is empty!");
                    }
                    break;

                // Case 5: Clear all elements from the set
                case 5:
                    st.clear();  // Removes all elements
                    System.out.println("Set cleared.");
                    break;

                // Case 6: Exit the program
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);  // Terminates the program

                // Default case for invalid input
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}

// Program to demonstrate the creation of Set object using the LinkedHashset class