package com.practice.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagram {

	public static void main(String[] args) {
		//System.out.println(checkAnagram("LISTEN","SILENT"));
		
		String[] arr = {"cat","tac","listen","act","silent"};
		
		anagram(arr);

	}
	
	public static boolean checkAnagram(String firstString, String secondString){
		
		Integer firstStringLength = firstString.length();
		Integer secondStringLength = secondString.length();
		
		if(firstStringLength != secondStringLength){
			return false;
		}
		
		char[] firstCharArray = firstString.toCharArray();
		char secondCharArray[] = secondString.toCharArray();
		
		Arrays.sort(firstCharArray);
		Arrays.sort(secondCharArray);
		System.out.println(firstCharArray);
		System.out.println(secondCharArray);
		
		for(int i=0; i<firstStringLength;i++){
			if(firstCharArray[i]!=secondCharArray[i]){
                    return false;
			}
		}
		return true;
		
	}
	
	public static void anagram(String[] arr){
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String str : arr){
			String word = str;
			char[] strArray = str.toCharArray();
			Arrays.sort(strArray);
			String newWord = new String(strArray);
			
			if(map.containsKey(newWord)){
				map.get(newWord).add(word);
			}else{
				List<String> list = new ArrayList<>();
				list.add(word);
				map.put(newWord,list);
			}
		}
		
		for(Map.Entry<String, List<String>> record : map.entrySet()){
			System.out.println(record.getValue());
		}
	}

}
