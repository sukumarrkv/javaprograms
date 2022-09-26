package com.practice.misc;

public class NumberPalindromeRunner {

	public static void main(String[] args) {
		System.out.println(isPalindrome(4545454));
		
	}
	public static boolean isPalindrome(int number){
		int r=0;
		int sum=0;
		int temp=number;
		while(number>0){
			r=number%10;
			sum=(sum*10)+r;
			number=number/10;
		}if(temp==sum){
			return true;
		}else{
			return false;
		}
	}
}
