package com.practice.springcore.di;

public class Student {

	private int id;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(int id) {
		this.id = id;
		//System.out.println("Id setter method called");
	}

	public void setName(String name) {
		this.name = name;
		//System.out.println("Name setter method called");
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		//System.out.println("Student all args constructor called");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
