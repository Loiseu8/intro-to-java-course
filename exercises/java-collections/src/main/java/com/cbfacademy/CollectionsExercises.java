package com.cbfacademy;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        LinkedList<Integer> integers = new LinkedList<>();
        // System.out.println(integers.size());

        // create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.addLast(2);
        integers.add(2,4);

        //  - invoke the method element() on the list and print the result on the screen
            System.out.print(integers.element());

        //  - return the list
            return integers;
       
    }

    // create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return t 

    public Stack<Integer> useStack() {
    Stack<Integer> stack = new Stack<>();
    stack.add(5);
    stack.add(6);
    stack.add(8);
    stack.add(9);
    System.out.print(stack.get(0));
    System.out.print(stack.getLast());
    System.out.print(stack.pop());
    stack.push(4);
    return stack;
}

    public ArrayDeque<Integer> useArrayDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(6);
        deque.add(8);
        deque.add(9);
        System.out.print(deque.getFirst());
        System.out.print(deque.getLast());
        System.out.print(deque.poll());
        System.out.print(deque.element());
        return deque;

        // create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the queue
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
    }

    public HashMap<Integer, String> useHashMap() {
        HashMap<Integer, String> hash = new HashMap<>();

        hash.put(1, "TypeScript");
        hash.put(2, "Kotlin");
        hash.put(3, "Python");
        hash.put(4, "Java");
        hash.put(5, "JavaScript");
        hash.put(6, "Rust");

        System.out.print(hash.keySet());
        System.out.print(hash.values());
        System.out.print(containsValue(value:"English"));
        return hash;



      }

        // create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of values from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        


    public String getName() {
        return "Collections Exercises";
    }
}
