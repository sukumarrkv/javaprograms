package com.practice.threads;

public class Task1 extends Thread{

	public void run(){
		System.out.println("Task1 started");
		for(int i=100; i<=199 ; i++){
			System.out.print(i +" ");
		}
		System.out.println("\n Task1 ended");
	}
	public void doTask(){
		System.out.println("Task1 started");
	for(int i=100; i<=199 ; i++){
		System.out.print(i +" ");
	}
	System.out.println("\n Task1 ended");
  }
}
