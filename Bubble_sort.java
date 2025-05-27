// Define a public class named Bubble_sort
public class Bubble_sort {

    // Generic method to perform bubble sort
    // <T extends Comparable<T>> means T must be a type that can be compared (like Integer, String)
    public static <T extends Comparable<T>> void bubbleSort(T[] array)
    {
        int n = array.length; // Get the length of the array
        // Outer loop - runs n-1 times
        for(int i = 0; i < n - 1; i++)
        {
            // Inner loop - compares adjacent elements
            for(int j = 0; j < n - i - 1; j++)
            {
                // Compare the current element with the next one
                // If the current element is greater, swap them
                if(array[j].compareTo(array[j + 1]) > 0)
                {
                    // Swapping using a temporary variable
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Generic method to print elements of an array
    public static <T> void printArray(T[] array)
    {
        // For-each loop to print each item in the array
        for(T item : array)
        {
            System.out.print(item + " "); // Print each item with space
        }
        System.out.println(); // Move to next line after printing the array
    }

    // Main method - program execution starts here
    public static void main(String[] args) {
        // Create an Integer array
        Integer[] intArray = {5, 3, 8, 12};

        // Create a String array
        String[] strArray = {"banana", "apple", "cherry", "date"};

        // Display original integer array
        System.out.println("Original integer array:");
        printArray(intArray);

        // Sort the integer array
        bubbleSort(intArray);

        // Display sorted integer array
        System.out.println("Sorted integer array:");
        printArray(intArray);

        // Display original string array
        System.out.println("Original string array:");
        printArray(strArray);

        // Sort the string array
        bubbleSort(strArray);

        // Display sorted string array
        System.out.println("Sorted string array:");
        printArray(strArray);
    }
}


// Using generic method perform Bubble sort. 