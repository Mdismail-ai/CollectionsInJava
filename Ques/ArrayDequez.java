package Ques; 

 import java.util.*;
public class ArrayDequez{
public static void main(String[] args) {
    Queue<Integer> queue = new ArrayDeque<>();
    queue.offer(10);
   // nulls are not allowed 
    //queue.offer(null);
    // no thred safe 
    // fifo 


//  Fast performance (faster than LinkedList)
// Works as Queue (FIFO) and Stack (LIFO)
// Does not allow null values
// Dynamic size (grows automatically)
// Not thread-safe
// FIFO order when used as a Queue
    queue.add(101);
    queue.add(102);
    queue.add(103);
    queue.add(104);
    System.out.println(queue.poll());
    System.out.println(queue.peek());
}
}