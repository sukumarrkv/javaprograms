package com.pratice.generics;

public class Print<T,V> {
	
	private T printTheThing;
	
	private V otherThing;

	public Print(T printTheThing, V otherThing) {
		super();
		this.printTheThing = printTheThing;
		this.otherThing = otherThing;
	}

	public T getPrintTheThing() {
		return printTheThing;
	}

	public void setPrintTheThing(T printTheThing) {
		this.printTheThing = printTheThing;
	}
	
	public void print(){
		System.out.println("Hello " + this.printTheThing);
		System.out.println("Hello "+ this.otherThing);
	}

}
