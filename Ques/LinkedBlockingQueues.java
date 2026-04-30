package Ques;

import java.util.Queue;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingQueues {
    public static void main(String[] args) {
// Thread-safe (used in multithreading)
// Can be bounded or unbounded
// FIFO order (First In First Out)
// Uses linked nodes internally (not array)
// Blocks when:
//Queue is full (for adding)
//Queue is empty (for removing)
// Does NOT allow null values

        Queue<Integer> queue = new LinkedBlockingDeque<>();
        queue.add(100);
        queue.add(1000);
        queue.add(10000);
        System.out.println(queue);
    }
}
