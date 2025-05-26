import java.util.Scanner; // For taking user input

// Base class: Publisher
class Publisher {
    String publisherName; // Publisher's name

    // Constructor to initialize publisher name
    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

// Book class inherits from Publisher
class Book extends Publisher {
    String bookTitle;  // Book title
    String author;     // Author of the book
    int price;         // Book price

    // Constructor to initialize all book details including publisher
    Book(String publisherName, String bookTitle, String author, int price) {
        super(publisherName); // Call constructor of Publisher class
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    // Display book details
    void display() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
        System.out.println("Price: Rs. " + price);
    }
}

// Literature class inherits from Book
class Literature extends Book {
    // Constructor calls Book constructor
    Literature(String publisherName, String bookTitle, String author, int price) {
        super(publisherName, bookTitle, author, price);
    }

    // Override display() to include a heading
    @Override
    void display() {
        System.out.println("\n--- Literature Book ---");
        super.display(); // Call parent class display() method
    }
}

// Fiction class inherits from Book
class Fiction extends Book {
    // Constructor calls Book constructor
    Fiction(String publisherName, String bookTitle, String author, int price) {
        super(publisherName, bookTitle, author, price);
    }

    // Override display() to include a heading
    @Override
    void display() {
        System.out.println("\n--- Fiction Book ---");
        super.display(); // Call parent class display() method
    }
}

// Main class
public class Override {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        // Ask user for number of books
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear newline character from input buffer

        // Array to store Book (Literature or Fiction) objects
        Book[] books = new Book[n];

        // Loop to take input for each book
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1));

            // Ask for category
            System.out.print("Category (Literature/Fiction): ");
            String category = sc.nextLine();

            // Ask for book title
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();

            // Ask for author name
            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            // Ask for publisher name
            System.out.print("Enter Publisher: ");
            String publisher = sc.nextLine();

            // Ask for book price
            System.out.print("Enter Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // Clear buffer

            // Depending on category, create appropriate object
            if (category.equalsIgnoreCase("Literature")) {
                books[i] = new Literature(publisher, title, author, price);
            } else if (category.equalsIgnoreCase("Fiction")) {
                books[i] = new Fiction(publisher, title, author, price);
            } else {
                System.out.println("Invalid category! Please re-enter this book.");
                i--; // Repeat this iteration
            }
        }

        // Display all book details
        System.out.println("\n=== Book Details ===");
        for (int i = 0; i < n; i++) {
            if (books[i] != null) {
                books[i].display(); // Polymorphism: calls appropriate display method
            }
        }

        sc.close(); // Close scanner
    }
}
// Write a program has class Publisher, Book, Literature and Fiction. Read the information
// and print the details of books from either the category, using inheritance. 