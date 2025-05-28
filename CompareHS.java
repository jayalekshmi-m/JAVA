// Import necessary classes
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CompareHS {
    public static void main(String[] args) {

        // Create Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        // Create two LinkedHashSet objects to store unique elements (in insertion order)
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        // Variables for user input
        int op, num;

        // Infinite loop for menu-driven program
        while (true) {
            // Display menu options
            System.out.println("1. Add to Set 1\n2. Add to Set 2\n3. Compare\n4. Exit");
            System.out.print("Enter your choice: ");
            op = sc.nextInt();  // Read user choice

            switch (op) {
                // Add element to Set 1
                case 1:
                    System.out.print("Enter element to insert into Set 1: ");
                    num = sc.nextInt();
                    set1.add(num);  // Adds element to Set 1
                    break;

                // Add element to Set 2
                case 2:
                    System.out.print("Enter element to insert into Set 2: ");
                    num = sc.nextInt();
                    set2.add(num);  // Adds element to Set 2
                    break;

                // Compare both sets
                case 3:
                    if (set1.equals(set2)) {
                        // If both sets have the same elements
                        System.out.println("✅ Both sets are equal.");
                    } else if (set2.containsAll(set1)) {
                        // If Set 2 contains all elements of Set 1
                        System.out.println("ℹ️ Set 2 contains all elements of Set 1 (Set 1 is subset).");
                    } else if (set1.containsAll(set2)) {
                        // If Set 1 contains all elements of Set 2
                        System.out.println("ℹ️ Set 1 contains all elements of Set 2 (Set 2 is subset).");
                    } else {
                        // If sets are different
                        System.out.println("❌ Sets are different.");
                    }
                    break;

                // Exit the program
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);  // End the program
                    break;

                // If user enters an invalid option
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }
    }
}

// Write a Java program to compare two hash set