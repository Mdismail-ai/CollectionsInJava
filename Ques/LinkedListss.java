package Ques;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListss {
   public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
 
//  Supports Queue operations: add(), offer(), poll(), peek()
// Internally uses doubly linked list
// Dynamic size (grows automatically)
// Allows null values (unlike ArrayDeque / BlockingQueue)
// Not thread-safe
    queue.add(null);
    queue.add(1);
    queue.add(1);
    queue.add(1);
    queue.add(1);
    queue.add(1);
    queue.add(1);
    System.out.println(queue);
   } 
}
