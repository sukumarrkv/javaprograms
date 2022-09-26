package com.primitivedatatypes.binumber;

public class BinumberRunner {

	public static void main(String[] args) {
		Binumber numbers = new Binumber(2,3);
		
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		
		numbers.doubleValue();
		
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());

	}

}
