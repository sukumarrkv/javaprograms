package com.pratice.anonymousclass;

public class AnonymousRunner {

	public static void main(String[] args) {
	Animal myAnimal = new Animal();
	myAnimal.makeNoise();
	
	Animal anotherAnimal = new Animal(){
		@Override
		public void makeNoise(){
			System.out.println("Anonymous class noise");
		}
	};
	
	anotherAnimal.makeNoise();
	
	Runnable myRunnable = new Runnable(){

		@Override
		public void run() {
			System.out.println("Runnable noise");			
		}
		
	};
	
	myRunnable.run();

	}

}
