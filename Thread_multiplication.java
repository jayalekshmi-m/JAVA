import java.util.Scanner;

// Thread to print multiplication table
class Multi extends Thread {
    int a;
    int limit;

    Multi(int a, int limit) {
        this.a = a;
        this.limit = limit;
    }

    public void run() {
        System.out.println("Multiplication table of " + a);
        for (int i = 1; i <= limit; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}

// Thread to display prime numbers
class Prime extends Thread {
    int start;
    int end;

    Prime(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Correctly scoped method inside Prime class
    private boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

public class Thread_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for multiplication table: ");
        int a = sc.nextInt();

        System.out.print("Enter limit of table: ");
        int limit = sc.nextInt();

        System.out.print("Enter starting number for prime check: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number for prime check: ");
        int end = sc.nextInt();

        Multi thread1 = new Multi(a, limit);
        Prime thread2 = new Prime(start, end);

        thread1.setName("Multiplication-Thread");
        thread2.setName("Prime-Thread");

        thread1.start();
        thread2.start();
    }
}

// Define 2 classes; one for generating multiplication table of 5 and other for displaying first
// N prime numbers. Implement using threads. (Thread class) 