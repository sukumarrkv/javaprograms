package com.practice.misc;

public class MoveZerosRunner2 {
	
	public static void moveZeros(int[] arr){
		int n = arr.length;
		int count = 0;
		for(int i=0;i<n;i++){
			if(arr[i] != 0){
				arr[count++]=arr[i];
			}
		}
		while(count<n){
			arr[count++]=0;
		}
	}

	public static void main(String[] args) {

		int arr[] = {1,0,2,4,0,0,5,7,0,1};
		moveZeros(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
