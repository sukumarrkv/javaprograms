package com.pratice.exception;

public class ExceptionRunner {

	public static void main(String[] args) {
		
		findLength();
		System.out.println("Main Ended");

	}

	private static void findLength() {
		try{
		String str = "ee";
		Integer length = str.length();
		System.out.println(length);
		}catch(NullPointerException npe){
			npe.printStackTrace();
		}catch(Exception e){
		    e.printStackTrace();
		}finally{
			System.out.println("Finally block");
		}
	}

}
