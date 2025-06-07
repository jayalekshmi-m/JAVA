import java.io.FileInputStream;  // For reading bytes from a file
import java.io.FileOutputStream; // For writing bytes to a file
import java.io.IOException;      // For handling input/output exceptions
import java.util.Scanner;        // For taking input from the user

public class FileCopy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create Scanner object to read user input

        // Ask user for source file path
        System.out.println("Enter source file path:");
        String source = sc.nextLine();  // Read source file path

        // Ask user for destination file path
        System.out.println("Enter destination file path:");
        String destination = sc.nextLine();  // Read destination file path

        FileInputStream fis = null;  // Declare FileInputStream for reading source file
        FileOutputStream fos = null; // Declare FileOutputStream for writing to destination

        try {
            // Open the source file for reading
            fis = new FileInputStream(source);

            // Open the destination file for writing
            fos = new FileOutputStream(destination);

            int byteRead;

            // Read and write data one byte at a time until end of file (-1)
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);  // Write the byte to the destination file
            }

            // Success message
            System.out.println("File copied successfully");

        } catch (IOException e) {
            // Catch and handle any IO errors (file not found, read/write issues, etc.)
            System.out.println("Error during file copy: " + e.getMessage());

        } finally {
            // This block always runs to close resources (even if an error occurred)

            try {
                // Close the input stream if it was opened
                if (fis != null)
                    fis.close();

                // Close the output stream if it was opened
                if (fos != null)
                    fos.close();

            } catch (IOException e) {
                // Catch any exception while closing the streams
                System.out.println("Error closing streams: " + e.getMessage());
            }
        }

        sc.close();  // Close the Scanner object to avoid resource leaks
    }
}

// pgm to copy one file to another