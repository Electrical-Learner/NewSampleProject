package org.example.collection;

import java.util.*;

public class QueueUsingTwoStack {
    static class Queue {

        static Stack<Integer> stackOne = new Stack<>();
        static Stack<Integer> stackTwo = new Stack<>();

        public static Boolean isEmpty() {
            return stackOne.isEmpty();
        }

        public static void add(int data) {
            while (!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
            stackOne.push(data);

            while (!stackTwo.isEmpty()) {
                stackOne.push(stackTwo.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stackOne.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stackOne.peek();
        }
    }


    public static void main(String[] args) {
       Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);


        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}


