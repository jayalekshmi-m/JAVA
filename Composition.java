import java.util.Scanner;

// Class to store academic student details
class Student {
    String name;
    int id;
    String dept;

    // Constructor to initialize student details
    Student(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}

// Class to store sports-related details
class Sports {
    String event;

    // Constructor to initialize sports event
    Sports(String event) {
        this.event = event;
    }
}

// Class Result uses composition: it "has-a" Student and "has-a" Sports
class Result {
    Student student;   // reference to Student object
    Sports sports;     // reference to Sports object
    int percentage;    // academic percentage

    // Constructor to initialize result with student and sports info
    Result(Student student, Sports sports, int percentage) {
        this.student = student;
        this.sports = sports;
        this.percentage = percentage;
    }

    // Method to display the complete result
    void display() {
        System.out.println("\n------ Student Result ------");
        System.out.println("Name           : " + student.name);
        System.out.println("ID             : " + student.id);
        System.out.println("Department     : " + student.dept);
        System.out.println("Sports Event   : " + sports.event);
        System.out.println("Percentage     : " + percentage + "%");
    }
}

// Main class with user input
public class Composition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        // Taking student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Clear newline character from buffer

        System.out.print("Enter department: ");
        String dept = sc.nextLine();

        System.out.print("Enter sports event: ");
        String event = sc.nextLine();

        System.out.print("Enter academic percentage: ");
        int percentage = sc.nextInt();

        // Creating objects of Student, Sports, and Result
        Student student = new Student(name, id, dept);
        Sports sports = new Sports(event);
        Result result = new Result(student, sports, percentage);

        // Displaying the complete result
        result.display();
    }
}

// Create classes Student and Sports. Create another class Result inherited from Student and
// Sports. Display the academic and sports score of a student. 

//can be also done using multi level inheritance.