package org.example.Threads;

// Ways to create Threads
/*
   There are two ways to create Threads
   1] Extending ThreadClass.
   2] Implementing Runnable Interface.

*/

import java.security.PublicKey;

class ThreadClass extends  Thread {
public void run() {
    System.out.println("Thread Created by extending Thread Class");   // Thread Created  Extending Thread Class
}

}

class runnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Created Implementing Runnable Interface");
    }
}

public class ThreadBasic {
    public static void main(String [] args) {
        ThreadClass t1 = new ThreadClass();
        t1.start();
        Thread t2 = new Thread(new runnableThread() );
        t2.start();
    }

}



