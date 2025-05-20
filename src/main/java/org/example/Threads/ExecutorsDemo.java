package org.example.Threads;

/*
                                * Java Executors *
 - Introduced In java 5,Used to manage and control multiple threads efficiently,replaces manual thread creation.
 - It provides asynchronous execution of tasks.
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorsDemo {
    public static void main(String [] args){

        /*
         ExecutorService: - ExecutorService is javaInterface that provides a high level replacement for managing
                            Threads, Its part of executors framework.
                            It Helps In :-
                            * Managing a pool of threads
                            * Running task asynchronously
                            * Controlling shutdown and task submission.
        */
        ExecutorService service = Executors.newFixedThreadPool(2); // Creating thread pool here of size two

        Runnable r1 = () ->{
          System.out.println("ExecutingTask1 by"+Thread.currentThread().getName()); // Create r1 Runnable Task.
        };

        Runnable r2 = () ->{
          System.out.println("ExecutingTask2 by"+Thread.currentThread().getName()); // Created r2 Runnable Task.
        };


        service.execute(r1); /*execute() is typically used for fire-and-forget tasks where you don’t need any feedback from the task (no return value or exception handling).
                              It's a void method, meaning it doesn't return anything.
                             */
        service.submit(r2); /*submit(): The submit() method of ExecutorService is used to submit a Callable (or Runnable) task.
                                        It returns a Future object that you can use to monitor the task's completion and get its result.
                            */
        service.shutdown(); /*shutdown() – initiates an orderly shutdown where previously submitted tasks are executed,
                                           but no new tasks will be accepted.
                            */

        try {
            if(!service.awaitTermination(5, TimeUnit.SECONDS)){
                System.out.println("Forcing ShutDown");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted while waiting for termination");
            service.shutdownNow();
        }

        System.out.println("Is ShutDown:"+ service.isShutdown());
        System.out.println("Is Terminated:"+service.isTerminated());


    }
}
