package com.practice.threads;

public class Task2 implements Runnable{

	public void doTask(){
		System.out.println("Task2 started");
	for(int i=200; i<=299 ; i++){
		System.out.print(i +" ");
		
	}
	System.out.println("\n Task2 ended");
	}

	@Override
	public void run() {
		System.out.println("Task2 started");
		for(int i=200; i<=299 ; i++){
			System.out.print(i +" ");
			
		}
		System.out.println("\n Task2 ended");
		
	}  
}
