package com.practice.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadsRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	   /**Task1 task1 = new Task1();
         task1.start();
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();
        
        task1.join();
        task2Thread.join(); //Join method ensures that thread is completed execution and next line o code is executed
        **/
		//Executing Single thread
		/**ExecutorService exser = Executors.newSingleThreadExecutor();
		exser.execute(new Task1());
		exser.execute(new Thread(new Task2()));
		exser.shutdown();
		**/
		
        /**
		//Executing two threads at a time
		ExecutorService exser1 = Executors.newFixedThreadPool(2);
		exser1.execute(new Task1());
		exser1.execute(new Thread(new Task2()));
		exser1.shutdown(); **/
		
		//Returning value from thread
		ExecutorService exser2 = Executors.newFixedThreadPool(1);
		Future<String> submit = exser2.submit(new CallableTask("World"));
        String msg = submit.get();
        System.out.println(msg);
        exser2.shutdown();
	}
     
}
