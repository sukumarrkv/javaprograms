package com.practice.misc;

import java.util.ArrayList;
import java.util.List;

public class MoveZerosRunner {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(0);
		list.add(2);
		list.add(7);
		list.add(0);
		list.add(0);
		list.add(5);
		System.out.println(list);
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for(Integer value : list){
			if(value != 0){
				list1.add(value);
			}else {
				list2.add(value);
			}
		}
		
		List<Integer> resultList = new ArrayList<>();
		resultList.addAll(list1);
		resultList.addAll(list2);
		System.out.println(resultList);

	}

}
