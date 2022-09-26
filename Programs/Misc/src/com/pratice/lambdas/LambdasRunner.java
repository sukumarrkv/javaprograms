package com.pratice.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasRunner {

	public static void main(String[] args) {
		//Cat myCat = new Cat();
		//myCat.makeNoise();
		//noise( (s)->System.out.println("Meow "+ s));
		
		//For Each
		List<Integer> iList = new ArrayList<>();
		iList.add(1);
		iList.add(2);
		iList.add(3);
		iList.add(4);
		//iList.stream().forEach(e -> System.out.println(e));
		
		//Filter
		//iList.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
		
		//map
		//iList.stream().map(e->e*e).forEach(e->System.out.println(e));
		
		//Collectors
		List<Integer> collect = iList.stream().filter(e -> e%2==1).collect(Collectors.toList());
		System.out.println(collect);
		
		//reduce
		int sum = iList.stream().reduce(0,(n1,n2)->(n1+n2));
		System.out.println(sum);
		
		//max
		int max = iList.stream().max((n1,n2)->Integer.compare(n1, n2)).get();
		System.out.println(max);
		
		//The other important methods are min, sorted and distinct
	}
	
	static void noise(Animal animal){
		animal.makeNoise("!");
	}
}
