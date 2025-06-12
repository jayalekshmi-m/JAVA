import java.util.Scanner;

// Interface with calculate() method to be implemented by Product class
interface Bill {
    int calculate(); // Returns total amount = quantity * unit price
}

// Product class implements the Bill interface
class Product implements Bill {
    int prod_id;
    String name;
    int quantity;
    int unit_price;

    // Constructor to initialize product details
    Product(int prod_id, String name, int quantity, int unit_price) {
        this.prod_id = prod_id;
        this.name = name;
        this.quantity = quantity;
        this.unit_price = unit_price;
    }

    // Implementation of calculate method from Bill interface
    public int calculate() {
        return quantity * unit_price;
    }

    // Method to display product details
    void display() {
        int total = calculate(); // Total cost for the product
        System.out.println("\nProduct Details:");
        System.out.println("ID       : " + prod_id);
        System.out.println("Name     : " + name);
        System.out.println("Quantity : " + quantity);
        System.out.println("Unit Price: " + unit_price);
        System.out.println("Total    : " + total);
    }
}

// Main class to handle input/output
public class Interface2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking for number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear the newline buffer

        // Creating an array to store multiple product objects
        Product[] pro = new Product[n];

        // Reading details for each product
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Clear newline

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter Unit Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // Clear newline

            // Creating product object and storing in array
            pro[i] = new Product(id, name, quantity, price);
        }

        int net_amt = 0; // To store total of all products

        // Displaying details and calculating net amount
        System.out.println("\n----- BILL DETAILS -----");
        for (int i = 0; i < n; i++) {
            pro[i].display(); // Display details for each product
            net_amt += pro[i].calculate(); // Add total to net amount
        }

        // Displaying the final net amount
        System.out.println("\nNet Amount: " + net_amt);
    }
}


// Prepare bill with the given format using calculate method from interface. 