package com.practice.java8;

import com.practice.java8.DefaultAndStaticMethodRunner.Interf;

class Sample implements Interf{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
	}
	
	public void m2(){
		System.out.println("M2 Method inside implementing class");
	}
}

public class DefaultAndStaticMethodRunner {
	
	interface Interf {
		public void m1();
		
		default void m2(){
			System.out.println("Default Method");
		}
		
		public static void m3(){
			System.out.println("Static Method");
		}
	}
	
	

	public static void main(String[] args) {
       Interf i = ()-> System.out.println("M1 Method");
       i.m1();
       i.m2();
       Interf.m3();
       System.out.println("----------");
		Sample s = new Sample();
		s.m2();
       
	}

}
