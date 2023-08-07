package org.example.collection;

import com.sun.source.tree.UsesTree;

import java.util.*;

public class SampleOfPriorityQueue {

    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Sharma");
        queue.add("Vijay");
        queue.add("Shankar");
        queue.add("Raj");


        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //   queue.poll();

        queue.remove();

        System.out.println("After removing: ");
        Iterator itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        System.out.println();
        ArrayList<Integer> integers = new ArrayList();
        integers.add(35432);
        integers.add(23);
        integers.add(334);
        integers.add(2234);
        integers.add(12303);
        System.out.println(integers);

        Iterator iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        int  removeValue = 21;
        if (integers.contains(removeValue)) {
            System.out.println("Before the if statement " + integers);
            integers.remove(Integer.valueOf(removeValue));
            System.out.println("After the if statement  " + integers);
        } else {
            System.out.println("\"Element not found\"");

        }
    }


}


