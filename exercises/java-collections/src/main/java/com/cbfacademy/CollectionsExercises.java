package com.cbfacademy;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // Create an empty linked list of integers
        LinkedList<Integer> integers = new LinkedList<>();

        // Add elements as specified
        integers.add(4);            // Add 4 as the first element
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.addLast(2);        // Add 2 as the last element
        integers.add(2, 4);         // Add 4 as the 3rd element (index 2)

        // Invoke the element() method and print the result (prints first element)
        System.out.print(integers.element());

        // Return the list
        return integers;
    }

    public Stack<Integer> useStack() {
        // Create an empty stack of integers
        Stack<Integer> stack = new Stack<>();

        // Add elements as specified
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);

        // Print the first and last elements of the stack
        System.out.print(stack.firstElement()); // First element
        System.out.print(stack.peek());         // Last element (top of the stack)

        // Invoke pop() to remove and print the top element
        System.out.print(stack.pop());

        // Push 4 onto the stack
        stack.push(4);

        // Return the stack
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // Create an empty ArrayDeque of integers
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add elements as specified
        deque.add(5);
        deque.add(6);
        deque.add(8);
        deque.add(9);

        // Print the first and last elements of the deque
        System.out.print(deque.getFirst());     // First element
        System.out.print(deque.getLast());      // Last element

        // Invoke poll() to remove and print the first element
        System.out.print(deque.poll());

        // Invoke element() to retrieve and print the first element without removing it
        System.out.print(deque.element());

        // Return the deque
        return deque;
    }

    public HashMap<Integer, String> useHashMap() {
        // Create an empty HashMap of Integer keys and String values
        HashMap<Integer, String> hash = new HashMap<>();

        // Add entries as specified
        hash.put(1, "TypeScript");
        hash.put(2, "Kotlin");
        hash.put(3, "Python");
        hash.put(4, "Java");
        hash.put(5, "JavaScript");
        hash.put(6, "Rust");

        // Print the set of keys and values
        System.out.print(hash.keySet());        // Print all keys
        System.out.print(hash.values());        // Print all values

        // Check if the map contains "English" as a value and print the result
        System.out.print(hash.containsValue("English"));

        // Return the map
        return hash;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
