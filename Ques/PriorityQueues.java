package Ques;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
// Not thread-safe
// Does NOT maintain insertion order
// Fast insert + delete (O log n)
// Always gives highest priority element first
        Queue<Integer> queue = new PriorityQueue<>();
        // 1,2,3.... preority  
        queue.add(100);
        queue.add(1000);
        queue.add(10000);
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());  this will remove and return the  null
        System.out.println(queue.peek());
    }
}
