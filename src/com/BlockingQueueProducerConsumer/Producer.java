package com.BlockingQueueProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    BlockingQueue<Integer> object; //producer and consumer will share the same queue

    public Producer(BlockingQueue<Integer> object){
        // accept an ArrayBlockingQueue object from
        // constructor
        this.object = object;
    }

    @Override
    public void run() {
        // Produce numbers in the range [1,4]
        // and put them in the buffer
        for (int i=1;i<=4;i++){
            try {

                Thread.sleep(2000);
                object.put(i); // adding value to queue
                System.out.println("produce " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
