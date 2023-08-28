package org.example.collection.queue;

import java.util.*;

public class QueueExample {
    //  static class Sample {
    int arr[] = new int[2];
    int value = 0;

    private void add(int data) {
        arr[value] = data;
        value++;
        System.out.print(value + " ");
    }

    private int peek() {
        int queue = value;
        queue--;
        return queue;

    }


//    }

    public static void main(String[] args) {
        Queue queueExample = new PriorityQueue();
        queueExample.add("ram");
        queueExample.add("sham");
        queueExample.add("ravi");
        queueExample.add("hari");

        System.out.println(queueExample);

        System.out.println(queueExample.poll());

        System.out.println(queueExample);

        Queue queue = new PriorityQueue();
        queue.add("sita");
        queue.add("raj");
        queue.add("lash");



        System.out.println(Collections.disjoint(queueExample,queue ));


    }

}
