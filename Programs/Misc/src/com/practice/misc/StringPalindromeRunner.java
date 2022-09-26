package com.practice.misc;

public class StringPalindromeRunner {

	public static void main(String[] args) {
		String str = "Mom and Dad know Malayalam";
		String[] newStr = str.split(" ");
		for (String word : newStr) {
			if(findPalindrome(word.toLowerCase())){
			System.out.println(word);
			}
		}

	}

	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		String reverseString = sb.reverse().toString();
		if (str.equals(reverseString)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean findPalindrome(String str){
		String reverseString = "";
		for(int i=0;i<=str.length()-1;i++){
			reverseString = str.charAt(i) + reverseString;
		}if(str.equals(reverseString)){
			return true;
		}else{
			return false;
		}
	}

}
