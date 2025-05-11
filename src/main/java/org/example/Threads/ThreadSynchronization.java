package org.example.Threads;

import java.security.PublicKey;

/*
    - we can do thread synchronization Using two ways
      1] Using synchronized () method
      2] Using synchronized Block
*/
class Counter {
    private int count = 0;

    public synchronized void  increment(){
        count ++;
    }

    public int getCount() {
        return count;
    }



}



public class ThreadSynchronization {

    public static void main(String args[]) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread( () ->{
            for(int i =0;i<1000;i++){
            counter.increment(); }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

     t1.start();
     t2.start();

     t1.join();
     t2.join();

     System.out.println(counter.getCount());

    }



}