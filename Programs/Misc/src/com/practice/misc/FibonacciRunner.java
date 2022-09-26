package com.practice.misc;

public class FibonacciRunner {

	public static void main(String[] args) {
		//printFibonacci(5);
		for(int i=0;i<=6;i++){
		System.out.print(" " + printFiboWithRecursion(i));
		}

	}

	public static void printFibonacci(int number){
		int n1 =0;
		int n2 =1;
		int n3;
		System.out.print(n1 + " "+n2);
		for(int i=2;i<number;i++){
	       n3=n1+n2;
	       System.out.print(" "+n3);
	       n1=n2;
	       n2=n3;
		}
	}
	
	public static long printFiboWithRecursion(int n){
	if(n<=1){
		return n;
	}else {
		return printFiboWithRecursion(n-1)+printFiboWithRecursion(n-2);
	}
	}
}
