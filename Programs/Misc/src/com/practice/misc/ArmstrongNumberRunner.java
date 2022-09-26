package com.practice.misc;

public class ArmstrongNumberRunner {

	public static void main(String[] args) {
		int number = 1634;
		System.out.println(numberOfDigits(number));
		System.out.println(isArmstong(number));

	}

	private static boolean isArmstong(int number) {
		int temp = number;
		int reminder = 0;
		int sum = 0;
		while(temp>0){
			reminder = temp % 10;
			temp = temp / 10;
			sum = sum + (int)Math.pow(reminder, numberOfDigits(number));
		}
		return sum == number;
	
	}
	
	private static Integer numberOfDigits(int number){
		int count = 0;
		while(number>0){
			number = number / 10;
			count++;
		}
		return count;
	}

}
