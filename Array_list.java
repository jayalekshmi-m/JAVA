// Import necessary classes from Java's utility package
import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {

    public static void main(String[] args) {

        // Create an ArrayList of Strings to hold the data
        ArrayList<String> list = new ArrayList<>();

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        String el; // Variable to store input string
        int ch;    // Variable to store user’s menu choice

        // Menu loop runs until user chooses to exit (ch == 0)
        do {
            // Display menu options
            System.out.print("\n----------------\n"
                    + "1: Add element\n"
                    + "2: Get size\n"
                    + "3: Search by index\n"
                    + "4: Find index of element\n"
                    + "5: Check if element exists\n"
                    + "6: Remove by value\n"
                    + "7: Remove by index\n"
                    + "8: Display list\n"
                    + "9: Clear list\n"
                    + "0: Exit\n"
                    + "----------------\n"
                    + "Enter your choice: ");

            // Get user’s choice
            ch = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (ch) {

                case 1: // Add element
                    System.out.print("Enter element to insert: ");
                    el = sc.nextLine(); // Read string input
                    list.add(el);       // Add to list
                    break;

                case 2: // Get list size
                    System.out.println("Size of the ArrayList: " + list.size());
                    break;

                case 3: // Get element by index
                    System.out.print("Enter index to search: ");
                    int indexSearch = sc.nextInt();
                    sc.nextLine();
                    if (indexSearch >= 0 && indexSearch < list.size()) {
                        System.out.println("Element at index " + indexSearch + " is " + list.get(indexSearch));
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4: // Get index of a given element
                    System.out.print("Enter element to find index: ");
                    el = sc.nextLine();
                    int index = list.indexOf(el);
                    if (index != -1)
                        System.out.println("Index of " + el + " is " + index);
                    else
                        System.out.println(el + " not found in the list.");
                    break;

                case 5: // Check if an element exists
                    System.out.print("Enter element to check: ");
                    el = sc.nextLine();
                    boolean contains = list.contains(el); // Check if element is in the list
                    System.out.println(el + " is in the list: " + contains);
                    break;

                case 6: // Remove element by value
                    System.out.print("Enter element to remove: ");
                    el = sc.nextLine();
                    boolean removed = list.remove(el); // Returns true if element was removed
                    if (removed)
                        System.out.println("Removed successfully. Updated list: " + list);
                    else
                        System.out.println("Element not found.");
                    break;

                case 7: // Remove element by index
                    System.out.print("Enter index to remove element: ");
                    int indexRemove = sc.nextInt();
                    sc.nextLine();
                    if (indexRemove >= 0 && indexRemove < list.size()) {
                        list.remove(indexRemove); // Remove element at the given index
                        System.out.println("Element removed. Updated list: " + list);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 8: // Display full list
                    System.out.println("Current List: " + list);
                    break;

                case 9: // Clear the list
                    list.clear();
                    System.out.println("List cleared.");
                    break;

                case 0: // Exit program
                    System.out.println("Exiting...");
                    break;

                default: // Invalid option handler
                    System.out.println("Invalid choice. Try again.");
                    break;
            }

        } while (ch != 0); // Keep looping until user chooses 0

        sc.close(); // Close scanner to free resources
    }
}

//  Maintain a list of Strings using ArrayList from collection framework, perform built-in
// operations.
