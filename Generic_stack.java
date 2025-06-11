import java.util.ArrayList;
import java.util.Scanner;

// Generic Stack class using ArrayList
class Stack<T> {
    ArrayList<T> A; // Internal ArrayList to hold stack elements
    int size;       // Maximum size of the stack
    int top = -1;   // Index of the top element (initially empty)

    // Constructor to initialize stack with given size
    Stack(int size) {
        this.size = size;
        A = new ArrayList<>(size);
    }

    // Method to push an element onto the stack
    void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack overflow");
        } else {
            top++;
            A.add(X);
        }
    }

    // Method to pop the top element from the stack
    void pop() {
        if (empty()) {
            System.out.println("Stack underflow");
        } else {
            A.remove(top); // Remove top element
            top--;         // Decrease top pointer
        }
    }

    // Method to return the top element without removing it
    T top() {
        if (empty()) {
            return null;
        } else {
            return A.get(top);
        }
    }

    // Method to check if the stack is empty
    boolean empty() {
        return top == -1;
    }

    // Overriding toString() to print stack content
    public String toString() {
        if (!A.isEmpty()) {
            String ans = "";
            for (int i = 0; i < top; i++) {
                ans += A.get(i) + " -> ";
            }
            ans += A.get(top); // Add top element
            return ans;
        } else {
            return "Stack is empty";
        }
    }
}

// Main class to test the generic stack
public class Generic_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size of the stack
        System.out.print("Enter size of stack: ");
        int size = sc.nextInt();

        // Create a Stack of Integers with given size
        Stack<Integer> s = new Stack<>(size);

        // Menu-driven interface
        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    Integer topVal = s.top();
                    if (topVal != null) {
                        System.out.println("Top element: " + topVal);
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;

                case 4:
                    System.out.println("Stack: " + s);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close(); // Close scanner
    }
}
