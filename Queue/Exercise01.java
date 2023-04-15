// Exercise 01:
// Using Java, simulate a line at a store or bank using a queue. The program should allow the customer to join the line and wait for service, and should serve customers in the order they joined the line.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Exercise01 {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        boolean running = true;

        // While loop, let the user choose when to exit
        while (running) {
            System.out.println("Enter join, serve or exit:");
            input = scanner.nextLine().toLowerCase();

            // Process user input.
            switch (input) {
                case "join":
                    //Ask for customer name
                    System.out.println("Enter your name:");
                    String customerName = scanner.nextLine();
                    // Add a customer to the line.
                    myQueue.add(customerName);
                    System.out.println(customerName + " has joined the line.");
                    break;
                case "serve":
                    // Serve the next customer in the line.
                    if (myQueue.isEmpty()) {
                        System.out.println("No customers in the line.");
                    } else {
                        System.out.println("Serving: " + myQueue.remove());
                    }
                    break;
                case "exit":
                    // Exit the program.
                    System.out.println("System exiting...");
                    scanner.close();
                    running = false;
                    return;
                default:
                    System.out.println("Invalid input. Please enter 'join', 'serve', or 'exit'.");
            }
            System.out.println("======================\n");
        }
    }
}
