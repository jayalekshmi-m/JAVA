import java.io.File;
import java.util.Scanner;

public class CheckFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner to take input from user

        System.out.print("Enter file name or path: ");
        String fname = sc.nextLine(); // Read file name as a string

        File f = new File(fname); // Create File object

        if (f.exists()) {
            System.out.println(fname + " exists.");
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("Size: " + f.length() + " bytes");
            System.out.println("Name: " + f.getName());
            System.out.println("Is readable: " + f.canRead());
            System.out.println("Is writable: " + f.canWrite());
        } else {
            System.out.println("File doesn't exist.");
        }

        sc.close(); // Close Scanner to free resources
    }
}

