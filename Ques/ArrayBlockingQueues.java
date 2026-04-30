package Ques;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueues {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(80);
// Thread-safe queue (used in multithreading)
// Fixed size (capacity must be defined)
// FIFO order (First In First Out)
// Blocks when full (for adding) and empty (for removing)
// Part of java.util.concurrent
// Does not allow null values

        queue.add(100);
        queue.add(1000);
        queue.add(10000);
        System.out.println(queue);
    }
}
