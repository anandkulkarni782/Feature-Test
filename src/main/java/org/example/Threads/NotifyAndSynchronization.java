package org.example.Threads;

// Producer and Consumer Problem.

import java.security.PublicKey;

class SimpleMessage{
    public Boolean isAvailable = false;

    public synchronized void produce()  {
        while(isAvailable){
            try {
                wait(); //
            }
            catch (InterruptedException e){
             e.printStackTrace();
            }
        }
        System.out.println("Message Is Produced");
        isAvailable=true;
        notify();


    }


    public synchronized void Consume (){
        while(!isAvailable){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("Message is Consumed");
        isAvailable =false;
        notify();

    }

}

public class  NotifyAndSynchronization{
    public static void main(String [] args) throws InterruptedException {
        SimpleMessage message = new SimpleMessage();
        Thread t1 = new Thread(()->{
              message.produce();
          });
        Thread t2 = new Thread(()->{
           message.Consume();
        });
        t1.start();
        t2.start();


        t1.join();
        t2.join();
    }
}


