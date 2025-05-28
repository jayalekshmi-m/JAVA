// Importing required classes
import java.util.Scanner; // For taking user input
import java.util.Stack;   // For using Stack data structure

// Class to demonstrate removing an element at a specific position in a stack
public class Remove_stack {
    
    // Method to remove an element from a specific position in the stack
    public static void removeAt(Stack<Integer> stack, int position) {
        // Check if the given position is valid
        if (position < 0 || position >= stack.size()) {
            System.out.println("Invalid position");
            return; // Exit the method if position is out of range
        }

        // Create a temporary stack to reverse elements above the target position
        Stack<Integer> temp = new Stack<>();

        // Move elements from original stack to temporary stack until we reach the target
        for (int i = 0; i < stack.size() - position - 1; i++) {
            temp.push(stack.pop()); // Pop from original and push to temporary
        }

        // Now the target element is at the top of the original stack
        System.out.println("Removed element: " + stack.pop()); // Remove the target element

        // Restore the elements back to the original stack from the temporary stack
        while (!temp.isEmpty()) {
            stack.push(temp.pop()); // Pop from temp and push back to original
        }
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        Stack<Integer> stack = new Stack<>(); // Create a stack of integers

        // Pre-load some elements into the stack
        stack.push(10);
        stack.push(20);

        // Display the current stack
        System.out.println("Current stack: " + stack);

        // Ask user for the position to remove
        System.out.print("Enter the position to remove (0 for bottom, " + (stack.size() - 1) + " for top): ");
        int position = sc.nextInt();

        // Call the removeAt method to remove the element
        removeAt(stack, position);

        // Display the updated stack
        System.out.println("Updated stack: " + stack);
    }
}


// Program to remove an object from the Stack when the position is passed as parameter