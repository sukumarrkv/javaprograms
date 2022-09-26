package com.oops.level2;

public class Fan {
	
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed; //0 to 5
	
	public Fan(String make2, double radius2, String color2) {
		this.make = make2;
		this.radius = radius2;
		this.color = color2;
	}
	
	public void switchOn(){
		this.isOn = true;
	    setSpeed((byte)3);
	}
	public void switchOff(){
		this.isOn = false;
	    setSpeed((byte)0);
	}
	public void setSpeed(byte speed){
		this.speed = speed;
	
	}
	public String toString(){
		return String.format("Make - %s,Radius - %f,color - %s,isOn - %b,Speed - %d", make,radius,color,isOn,speed);
	}
	}

