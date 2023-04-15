// Exercise 1: Check if a string of parentheses is balanced, meaning each opening parenthesis has a corresponding closing parenthesis in the correct order. The output of each check should be either true or false. Use the following examples to be evaluated:
//  parentheses1 = ( ( ( ) ) )
//  parentheses2 = ( ( ) ( ) )
//  parentheses3 = ( ( )
//  parentheses4 = ( ) )

import java.util.Stack;

public class Exercise01 {
    public static void main(String[] args) {
        String p1 = "((()))";
        String p2 = "(()())";
        String p3 = "(()";
        String p4 = "())";

        System.out.println("p1: " + isBalanced(p1)); // Output: true
        System.out.println("p2: " + isBalanced(p2)); // Output: true
        System.out.println("p3: " + isBalanced(p3)); // Output: false
        System.out.println("p4: " + isBalanced(p4)); // Output: false
    }

    // Checks if a string of parentheses is balanced.
    public static boolean isBalanced(String s) {
        // Create a stack to store opening parentheses.
        Stack<Character> myStack = new Stack<>();

        // Iterate through the characters in the input string.
        for (char c : s.toCharArray()) {
            // If the character is an opening parenthesis, push it onto the stack.
            if (c == '(') {
                myStack.push(c);
            } else if (c == ')') {
                // If the character is a closing parenthesis, check if the stack is empty
                // or if the top element is not an opening parenthesis.
                if (myStack.isEmpty() || myStack.pop() != '(') {
                    // In either case, return false (unbalanced).
                    return false;
                }
            }
        }

        // If the stack is empty, the string is balanced; otherwise, it is unbalanced.
        return myStack.isEmpty();
    }
}
