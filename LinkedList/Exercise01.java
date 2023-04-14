// Exercise 2: Create a list with the following elements - apple, banana, and cherry. Write code that accomplishes the following:
// 1. Print the list using println.
// 2. Add orange to the beginning of the list.
// 3. Print the list again.
// 4. Remove an element from the list.
// 5. Print the list again.
// 6. Get an element at a specific index.
// 7. Print the size of the list.

import java.util.LinkedList;

class Exercise01 {
    public static void main(String[] args) {

        // Declare the linkedlist where we will add our fruits
        LinkedList<String> myLinkedList = new LinkedList<String>();

        // populate the linkedlist with values indicated in the instruction
        myLinkedList.add("apple");
        myLinkedList.add("banana");
        myLinkedList.add("cherry");

        // We can print the list using println and it will show us all the data inside the linkedlist -> [apple, banana, cherry]
        System.out.println(myLinkedList);

        // To add the orange to the beginning of the list, we will use the linkedlist method addFirst
        myLinkedList.addFirst("orange");

        // Print the list again -> The output would be [orange, apple, banana, cherry]
        System.out.println(myLinkedList);

        // We can remove an element in the list by using the remove method
        // We can use the index or the value that is inside the list
        // this will remove apple from the list
        myLinkedList.remove("apple");

        // Print the list again -> The output would be [orange, banana, cherry]
        System.out.println(myLinkedList);

        // Lets try using the index this time
        // this will remove the cherry in the list since the index of orange = 0, banana = 1, cherry = 2
        myLinkedList.remove(2);

        // Print the list again -> The output would be [orange, banana]
        System.out.println(myLinkedList);

        // Declare the index we want to access
        int index = 1;
        // Lets get the element in the list using the get method
        String fruit = myLinkedList.get(index);
        // The answer will be banana as it has index 1
        System.out.println("The element at index " + index + " is " + fruit);

        // Lets try to find out the size of the linkedList using the size method
        int size = myLinkedList.size();

        // print the size -> outputs 2
        System.out.println("The size of the linked list is " + size);
    }
}