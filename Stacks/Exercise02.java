// Exercise 02:
// Write a series of code that:
// - Pushes three elements onto the stack - Alice, Bob, Charlie
// - Pops the pushed elements
// - Prints the popped elements using system.out.println (observe how LIFO is applied)
// - Checks if the stack is empty (this should return true)
import java.util.Stack;

public class Exercise02 {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        // Push three elements onto the stack.
        myStack.push("Alice");
        myStack.push("Bob");
        myStack.push("Charlie");

        // Pop the elements from the stack and print them.
        // Using a while loop because it can directly check the isEmpty() condition.
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }

        // Check if the stack is empty (should return true).
        System.out.println("Stack empty? " + myStack.isEmpty());
    }
}
