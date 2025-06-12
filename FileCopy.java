import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);  // Create Scanner to take user input
        System.out.println("Enter the source filename");
        String filename = sc.nextLine();      // Read name of the source file (file to copy from)

        // Open the source file for reading
        FileInputStream fis = new FileInputStream(filename);  // Create input stream for the file
        byte[] b = new byte[fis.available()]; // Create byte array to store file content
        fis.read(b);                          // Read the file content into the byte array
        fis.close();                          // Close the input stream (good practice)

        // Get the name of the file to copy into
        System.out.println("Enter the destination filename");
        String filename2 = sc.nextLine();     // Read destination file name

        // Open/create the destination file and write to it
        FileOutputStream fos = new FileOutputStream(filename2); // Create output stream
        fos.write(b);                         // Write contents (from byte array) to the new file
        fos.close();                          // Close the output stream
    }
}

// pgm to copy one file to another