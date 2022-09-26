package com.pratice.generics;

import java.util.ArrayList;
import java.util.List;

public class PrintRunner {

	public static void main(String[] args) {
		Print<Boolean, String> myPrint = new Print<>(true, "There");
	    //myPrint.print();
      //shout("Hello");
      //shout(1);
      //shout(true);
      
      //shoutAgain("Hello", 1);
      List<String> sList = new ArrayList<>();
      sList.add("Hello");
      printList(sList);
      
      List<Integer> iList = new ArrayList<>();
      iList.add(2);
      printList(iList);
	}

	//Generics Methods
	private static <T> void shout(T thingToPrint){
		System.out.println(thingToPrint + "!!!");
	}
	
	private static <T,V> void shoutAgain(T firstThing, V secondThing){
		System.out.println(firstThing);
		System.out.println(secondThing);
	}
	
	//Wildcards in generics
	
	private static void printList(List<?> myList){
		System.out.println(myList);
	}
}
 
