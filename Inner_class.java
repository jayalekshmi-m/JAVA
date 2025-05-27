import java.util.Scanner; // Import Scanner class for user input

// Outer class CPU
class CPU {
    int price; // Instance variable to hold the price of the CPU

    // Constructor to initialize price
    CPU(int price) {
        this.price = price;
    }

    // Non-static inner class Processor
    class Processor {
        int no_of_cores; // Number of processor cores
        String manufacturer; // Manufacturer of the processor

        // Constructor to initialize Processor attributes
        Processor(int no_of_cores, String manufacturer) {
            this.no_of_cores = no_of_cores;
            this.manufacturer = manufacturer;
        }

        // Method to display processor details
        void display() {
            System.out.println("Processor information:");
            System.out.println("Cores: " + no_of_cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Static nested class RAM
    static class RAM {
        int memory; // RAM memory size in GB
        String manufacturer; // Manufacturer of the RAM

        // Constructor to initialize RAM attributes
        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        // Method to display RAM details
        void display() {
            System.out.println("RAM information:");
            System.out.println("Memory: " + memory + "GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
}

// Main class to run the program
public class Inner_class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Input for processor
        System.out.println("Enter number of cores:");
        int cores = sc.nextInt(); // Read number of cores
        sc.nextLine(); // Consume the leftover newline

        // Input for RAM
        System.out.println("Enter memory of RAM (in GB):");
        int memory = sc.nextInt(); // Read RAM memory
        sc.nextLine(); // Consume the leftover newline

        // Input for processor manufacturer
        System.out.println("Enter manufacturer of processor:");
        String manufacturer1 = sc.nextLine(); // Read processor manufacturer

        // Input for RAM manufacturer
        System.out.println("Enter manufacturer of ram:");
        String manufacturer2 = sc.nextLine(); // Read RAM manufacturer

        // Calculate price based on input
        int price = (cores * 1000) + (memory * 500);

        // Create an instance of outer class CPU with the calculated price
        CPU cpu = new CPU(price);

        // Create an instance of the non-static inner class Processor using CPU object
        CPU.Processor pro = cpu.new Processor(cores, manufacturer1);

        // Create an instance of the static nested class RAM directly
        CPU.RAM ram = new CPU.RAM(memory, manufacturer2);

        // Display CPU configuration
        System.out.println("\nCPU configuration:\n");
        pro.display(); // Display processor details
        ram.display(); // Display RAM details
        System.out.println("Price of CPU: " + cpu.price); // Display CPU price
    }
}

// Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)
// and static nested class RAM (memory, manufacturer). Create an object of CPU and print
// information of Processor and RAM. 