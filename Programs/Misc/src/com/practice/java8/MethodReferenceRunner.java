package com.practice.java8;

public class MethodReferenceRunner {
	
	public static void doSomething(){
		for(int i=0;i<5;i++){
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
       
		Runnable r = MethodReferenceRunner::doSomething;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<5;i++){
			System.out.println("Main Thread");
		}
	}

}
