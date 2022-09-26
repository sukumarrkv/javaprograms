package com.practice.misc;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceRunner {

	public static void main(String[] args) {
		
		String str ="Hello there how are you";
		
		Map<Character, Integer> charOccurence = new HashMap<>();
		char[] charArray = str.toCharArray();
		for(char c : charArray){
			if(charOccurence.containsKey(c)){
				charOccurence.put(c, charOccurence.get(c)+1);
			}else{
				charOccurence.put(c, 1);
			}
		}
		System.out.println(charOccurence);
		
	}
}
