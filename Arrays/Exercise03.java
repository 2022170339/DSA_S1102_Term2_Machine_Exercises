// Exercise 3: Write a Java program that creates an array of 5 integers and prompts the user to enter 5 integer values to fill the array. The program should then find the sum of all the elements in the array and print the result.
import java.util.Scanner;

class Exercise03 {
    public static void main(String[] args) {
        // Since the requirement is for use to input the value of the array, we will need to use
        // the utility class Scanner so that the program can accept our inputs
        Scanner scanner = new Scanner(System.in);

        // Declare an empty array of 5 integers
        int[] myArray = new int[5];

        // Initialize the sum container
        int sum = 0;

        // We need to loop through all these empty elements and set them the value
        // During each iteration, we will ask the user to enter the integer value that 
        // they want to store
        for (int i = 0; i < myArray.length; i++) {
            // Prompt and get the user's input
            System.out.print("#"+(i+1)+" Enter a number : ");
            int input = scanner.nextInt();

            // Store the input inside the array using their index
            myArray[i] = input;
        
            // since we want to get the sum of all element, we can add this to our sum container
            sum += input;
        }

        // Do not forget to close the scanner when we are done
        scanner.close();

        // Print the result
        System.out.println("The sum of the array is: " + sum);
    } 
}
