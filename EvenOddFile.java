import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EvenOddFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Get filenames from user
        System.out.print("Enter the input filename: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter the filename to store even numbers: ");
        String evenFile = sc.nextLine();

        System.out.print("Enter the filename to store odd numbers: ");
        String oddFile = sc.nextLine();

        // Open the input file to read numbers
        Scanner fileScanner = new Scanner(new File(inputFile));

        // Create FileWriters to write even and odd numbers
        FileWriter evenWriter = new FileWriter(evenFile);
        FileWriter oddWriter = new FileWriter(oddFile);

        // Read and process each number from the file
        while (fileScanner.hasNextInt()) {
            int num = fileScanner.nextInt();

            if (num % 2 == 0) {
                evenWriter.write(num + "\n");
            } else {
                oddWriter.write(num + "\n");
            }
        }

        // Close all resources
        fileScanner.close();
        evenWriter.close();
        oddWriter.close();
        sc.close();

        System.out.println("Even and odd numbers successfully separated!");
    }
}
