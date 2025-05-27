// Import Scanner class for user input
import java.util.Scanner;

// Custom Exception for invalid name (non-alphabet characters)
class NameException extends RuntimeException {
    NameException(String message) {
        super(message); // Pass error message to the parent (RuntimeException)
    }
}

// Custom Exception for invalid password (too short or no digit)
class PasswordException extends RuntimeException {
    PasswordException(String message) {
        super(message); // Pass error message to the parent (RuntimeException)
    }
}

// User class to hold user credentials and provide login functionality
class User {
    String name;
    String password;

    // Constructor to initialize username and password
    User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Method to check login credentials
    public void login(String uname, String pass) {
        if (this.name.equals(uname) && this.password.equals(pass)) {
            System.out.println("Login successful"); // Credentials match
        } else {
            // Throw exception if either username or password is wrong
            throw new NameException("Invalid username or password");
        }
    }
}

// Main class to drive the program
public class Validation2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        // Step 1: Accept username
        System.out.println("Enter username:");
        String name = sc.nextLine();

        // Step 2: Validate name character by character
        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                // Throw exception if name contains anything other than letters
                throw new NameException("Invalid name: only alphabets allowed");
            }
        }

        // Step 3: Accept password
        System.out.println("Enter password:");
        String password = sc.nextLine();

        // Step 4: Check password length
        if (password.length() < 8) {
            throw new PasswordException("Password must be at least 8 characters");
        }

        // Step 5: Check if password contains at least one digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true; // Found a digit
                break; // Exit loop early
            }
        }

        if (!hasDigit) {
            // If no digit found, throw exception
            throw new PasswordException("Password must contain at least 1 digit");
        }

        // Step 6: Create a user with the validated name and password
        User user = new User(name, password);

        // Step 7: Ask for login credentials
        System.out.println("Enter login username:");
        String loginName = sc.nextLine();

        System.out.println("Enter login password:");
        String loginPass = sc.nextLine();

        // Step 8: Attempt login and handle any exceptions
        try {
            user.login(loginName, loginPass);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // Show error message if login fails
        }
    }
}

// Write a user defined exception class to authenticate the user name and password. 