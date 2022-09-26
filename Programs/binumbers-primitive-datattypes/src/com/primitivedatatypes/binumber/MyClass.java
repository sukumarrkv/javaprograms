package com.primitivedatatypes.binumber;

public class MyClass {
  private int number;
  
	public MyClass(int number) {
		this.number = number;
	}

   public int calculatedValue(){
	   int value = 1;
	   while (number!=0){
		   value = value *(number % 10);
		   number = number/10;
	   }
	   return value;
   }
}
