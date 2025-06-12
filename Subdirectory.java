import java.io.File;
import java.util.Scanner;

public class Subdirectory {

    // Method to list all files and directories recursively using a basic for-loop
    static void ls(File dir) {
        File[] subfiles = dir.listFiles(); // Get list of all files and subdirectories

        if (subfiles != null) {
            for (int i = 0; i < subfiles.length; i++) {
                File x = subfiles[i]; // Get the current file/directory
                System.out.println("- " + x.getName()); // Print its name

                if (x.isDirectory()) {
                    ls(x); // If it’s a directory, call ls() again (recursively)
                }
            }
        }
    }

    // Method to search for a file by name inside a directory and its subdirectories
    static void search(File dir, String name) {
        File[] subfiles = dir.listFiles(); // Get list of all files/subdirectories in current directory

        if (subfiles != null) {
            for (int i = 0; i < subfiles.length; i++) {
                File x = subfiles[i]; // Current file or folder

                if (x.isFile() && x.getName().equals(name)) {
                    System.out.println("The file found at: " + x.getAbsolutePath());
                    return; // Exit once file is found
                } else if (x.isDirectory()) {
                    search(x, name); // If it's a folder, search inside it
                }
            }
        }

        // Only prints if not found in this level and not already returned above
        System.out.println("The file \"" + name + "\" not found inside " + dir);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the directory path: ");
        String dpath = sc.nextLine(); // Read directory path

        File directory = new File(dpath); // Create a File object for the path

        if (directory.exists()) {
            System.out.println("The files in directory \"" + directory.getName() + "\" are:");
            ls(directory); // List all files/subdirectories

            System.out.print("\nEnter a file name to search: ");
            String fname = sc.nextLine(); // Read file name to search
            search(directory, fname); // Call search
        } else {
            System.out.println("Invalid path!!!");
        }

        sc.close(); // Close scanner
    }
}

// pgm to list the sub directories and also search for a file name.