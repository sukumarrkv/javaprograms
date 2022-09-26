package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class FlatMapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = { 2, 2, 3 };
		Integer b[] = { 4, 6, 7 };
		Integer c[] = { 9, 5, 8 };
		List<List<Integer>> arr = new ArrayList<>();
		arr.add(Arrays.asList(a));
		arr.add(Arrays.asList(b));
		arr.add(Arrays.asList(c));
		// doSomething(arr);
		// System.out.println(diagonalDifference(arr));
		List<Integer> sortList = new ArrayList<>();
		sortList.add(1);
		sortList.add(5);
		sortList.add(1);
		sortList.add(10);
		sortList.add(2);
		sortList.add(32);
		System.out.println(countingSort(sortList));

	}

	public static void doSomething(List<List<Integer>> list) {
		List<Integer> flatList = list.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		System.out.println(flatList);
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int leftDiagonal = 0;
		int rightDiagonal = 0;
		int length = arr.size();
		for (int i = 0; i < length; i++) {
			leftDiagonal += arr.get(i).get(i);
			rightDiagonal += arr.get(i).get(length - (i + 1));
		}
		return Math.abs(leftDiagonal - rightDiagonal);
	}

	public static List<Integer> countingSort(List<Integer> arr) {
		// Write your code here
		int[] array = new int[100];
		Arrays.fill(array, 0);
		List<Integer> res = new ArrayList<>();
		for (Integer number : arr) {
			array[number]++;
		}
		for (int i = 0; i < 100; i++) {
			res.add(array[i]);
		}
		return res;

	}

}
