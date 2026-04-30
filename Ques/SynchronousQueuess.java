package Ques;

import java.util.concurrent.SynchronousQueue;

public class SynchronousQueuess {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Putting 1");
                queue.put(1);

                System.out.println("Putting 2");
                queue.put(2);
                } catch (Exception e) {
                    System.out.println(e);
                
                
            }
            }
        };

        // Consumer thread
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                try {
                Thread.sleep(1000);

                System.out.println("Taking: " + queue.take());
                System.out.println("Taking: " + queue.take());

            } catch (InterruptedException e) {
                System.out.println(e);
            }
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    };
   
}

// No capacity (zero-size queue)
// Each insert waits for a remove
// Each remove waits for an insert
// Used for direct thread-to-thread communication
// Very useful in producer-consumer problems
// Does not store elements