package com.pratice.singleton;

public class SingletonRunner {

	public static void main(String[] args) {
//		Singleton singleton = Singleton.getInstance();
//
//		System.out.println(singleton.hashCode());
//
//		Singleton singleton1 = Singleton.getInstance();
//
//		System.out.println(singleton1.hashCode());
		
		LazyInnerClassSingleton obj1 = LazyInnerClassSingleton.getInstance();
		System.out.println(obj1.hashCode());
		
		LazyInnerClassSingleton obj2 = LazyInnerClassSingleton.getInstance();
		System.out.println(obj2.hashCode());

	}

}
