// Exercise 2: Write a Java program to test if an array contains a specific value. Create an array with five elements.

class Exercise02 {
    public static void main(String[] args) {
        // We'll use the exercise 01 examples

        // First we initialize the array with the following values 25, 4, 16, 9, 10
        int[] myArray = { 25, 4, 16, 9, 10 };

        // Declare the data that we want to search for
        // In this case, we want to look for an integer with the value of 9
        int search = 9;

        // Declare a boolean so that we'll be able to tell if we already find the element we want to find.
        boolean found = false;

        // To find a certain element in an array, we need to loop through and check each element inside it
        // This loops through each element and check if it is the one we are looking for
        for(int i = 0; i < myArray.length; i++) {

            // Since we now have access to each element, we will do an if condition that will
            // check the element's value and compare it to the search variable that we set.
            if(search == myArray[i]) {

                // we set the found to true to tell the program we already found the element
                found = true;

                // we will force to break the for loop since continuing the loop when we already find
                // the element will cause unnecesarry executions.
                break;
            }
        }

        // Print statements that will be based on the result
        if(found) { 
            System.out.println("The array contains the value of: " + search);
        } else {
            System.out.println("The array does not contains the value of: " + search);
        }
    }
}