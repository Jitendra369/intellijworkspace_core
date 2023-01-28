package com.BlockingQueueProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    BlockingQueue<Integer> object;

    // Initialize taken to -1
    // to indicate that no number
    // has been taken so far.
    int taken = -1;

    Consumer(BlockingQueue<Integer> object){
        this.object = object;
    }

    // Take numbers from the buffer and
    // print them, if the last number taken
    // is 4 then stop
    @Override
    public void run() {
        while (taken != 4){
            try {
                taken = object.take(); // remove the value from the queue
                System.out.println("consume value "+ taken);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
