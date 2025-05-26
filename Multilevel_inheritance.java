// Import the Scanner class to read user input
import java.util.Scanner;

// Base class Person with common attributes
class Person {
    String name;
    String gender;
    String address;
    int age;

    // Constructor to initialize Person details
    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Employee class inherits from Person and adds more specific employee-related attributes
class Employee extends Person {
    int emp_id;
    String company_name;
    String qualification;
    int salary;

    // Constructor to initialize Employee details, including those from Person using super()
    Employee(String name, String gender, String address, int age,
             int emp_id, String company_name, String qualification, int salary) {
        super(name, gender, address, age); // Call Person class constructor
        this.emp_id = emp_id;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Teacher class inherits from Employee and adds more specific attributes
class Teacher extends Employee {
    String subject;
    String dept;
    int tr_id;

    // Constructor to initialize Teacher details, including those from Employee and Person
    Teacher(String name, String gender, String address, int age,
            int emp_id, String company_name, String qualification, int salary,
            String subject, String dept, int tr_id) {
        super(name, gender, address, age, emp_id, company_name, qualification, salary); // Call Employee constructor
        this.subject = subject;
        this.dept = dept;
        this.tr_id = tr_id;
    }

    // Method to display teacher's complete details
    void display() {
        System.out.println("------------ Teacher Details ------------");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Company Name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + dept);
        System.out.println("Teacher ID: " + tr_id);
    }
}

// Main class to run the program
public class Multilevel_inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Ask user for number of teachers
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear the newline character after nextInt

        // Create an array to store Teacher objects
        Teacher[] teachers = new Teacher[n];

        // Input details for each teacher
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");

            // Take inputs one by one
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Employee ID: ");
            int emp_id = sc.nextInt();
            sc.nextLine(); // Clear buffer

            System.out.print("Company Name: ");
            String company_name = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Salary: ");
            int salary = sc.nextInt();
            sc.nextLine(); // Clear buffer

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Teacher ID: ");
            int tr_id = sc.nextInt();
            sc.nextLine(); // Clear buffer

            // Create a Teacher object and store it in the array
            teachers[i] = new Teacher(name, gender, address, age,
                                      emp_id, company_name, qualification, salary,
                                      subject, dept, tr_id);
        }

        // Display details of all teachers
        System.out.println("\n=== Displaying Teacher Information ===");
        for (int i = 0; i < n; i++) {
            teachers[i].display(); // Call display() method of each Teacher
        }
    }
}


//Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor
// to initialize the data members and another class ‘Employee’ that inherits the properties of
// class Person and also contains its own data members like Empid, Company_name,
// Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits
// the properties of class Employee and contains its own data members like Subject,
// Department, Teacherid and also contain constructors and methods to display the data
// members. Use array of objects to display details of N teachers. 