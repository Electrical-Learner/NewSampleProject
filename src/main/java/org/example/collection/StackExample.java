package org.example.collection;

import javax.swing.plaf.nimbus.State;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Queue queue = new PriorityQueue();
        queue.add(10);

        Stack s = new Stack();
        s.add("This");
        s.add("is");
        s.add("a");
        s.add("Stack");


        Iterator iterator = s.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+ " ");
        }

        System.out.println();

        s.pop();  //pop operation
        System.out.println("Pop Output: ");
        Iterator iteratorForPop = s.iterator();

        while (iteratorForPop.hasNext()) {
            System.out.print(iteratorForPop.next() + " ");
        }

        System.out.println();

        s.peek();  //peek operation
        System.out.println(" peek Output: ");
        Iterator iteratorForPeek = s.iterator();

        while (iteratorForPeek.hasNext()) {
            System.out.print(iteratorForPeek.next() + " ");
        }
    }
}
