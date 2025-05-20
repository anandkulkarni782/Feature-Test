package org.example.Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Callable_FutureInterface {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<String>>tasks = new ArrayList<>();
        tasks.add(()->{
           Thread.sleep(1000);
           return "Message Coming from task1";
        });

        tasks.add(()->{
           Thread.sleep(1000);
           return "Message Coming from task2";
        });

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<String>> result = executor.invokeAll(tasks); // Throws InterruptedException

        for(Future<String> future :result){
            System.out.println(future.get()); // Throws ExecutionException
        }

        executor.shutdown();
    }

}
