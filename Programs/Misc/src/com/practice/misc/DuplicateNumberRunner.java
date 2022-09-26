package com.practice.misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateNumberRunner {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,1,4,9,4};
		//findDuplicatesUsingSet(arr);
		//findDuplicatesUsingMap(arr);
		//findDuplicatesUsingLoops(arr);
		
		String s = "Hello";
		s=s.concat(" all");
		s= s+" !!";
		s=s.toUpperCase();
		System.out.println(s);
		
//		try{
//			String st = null;
//			st.length();
//			System.out.println("try");
//		}catch(ArithmeticException ae){
//			System.out.println("Arthematic Exception");
//			ae.printStackTrace();
//		}catch(Exception e){
//			System.out.println("Exception");
//			e.printStackTrace();
//		}finally{
//			System.out.println("finally");
//		}
//		System.out.println("outside try");

	}

	private static void findDuplicatesUsingLoops(int[] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					System.out.println(arr[j]);
				}
			}
		}
		
	}

	private static void findDuplicatesUsingMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int number : arr){
			if(map.containsKey(number)){
				map.put(number, map.get(number)+1);
			}else {
				map.put(number, 1);
			}
		}
		for(Map.Entry<Integer, Integer> value : map.entrySet()){
			if(value.getValue()>1){
				System.out.println(value.getKey());
			}
		}
		
	}

	private static void findDuplicatesUsingSet(int[] arr) {
		Set<Integer> integerSet = new HashSet<>();
		for(int number : arr){
			if(integerSet.add(number)== false){
				System.out.println(number);
			}
		}
		
	}

}
