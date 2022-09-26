package com.oops.level2;

public class Rectangle {

	private int length;
	private int breadth;



	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
    public int area(){
	  return length * breadth;
    }
	public int perimeter(){
		return 2 * (length+breadth);
	}
	public String toString(){
		return String.format("Length -%d Breadth -%d Area -%d Perimeter -%d ", length,breadth,area(),perimeter());
	}	
}
