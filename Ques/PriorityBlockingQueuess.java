package Ques;

//import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
public class PriorityBlockingQueuess{
    public static void main(String[] args) {
           // Thread-safe queue (used in multithreading)
           // Unbounded (no fixed capacity)
           // Priority-based ordering (not FIFO)
           // Does not block on insertion
           // Blocks only when retrieving from an empty queue (take())
           // Does not allow null values
        //Queue<Integer> queue1 = new PriorityBlockingQueue<>();
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.add(10);
        queue.add(2);
        queue.add(30);
        queue.add(5);
        try {
        // Removing elements (in priority order - ascending)
        System.out.println(queue.take()); // 2
        System.out.println(queue.take()); // 5
        System.out.println(queue.take()); // 10
        System.out.println(queue.take()); 
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}