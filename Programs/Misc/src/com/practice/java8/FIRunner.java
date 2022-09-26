package com.practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FIRunner {
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("ABC", 45));
		students.add(new Student("DEF", 66));
		students.add(new Student("GHI", 86));
		students.add(new Student("XYZ", 38));
		students.add(new Student("LMN", 49));
		students.add(new Student("OPQ", 88));
		
		Function<Student, String> f = s -> {
			String grade = "";
			if(s.getMarks()>80){
				grade = "A";
			}else if(s.getMarks()>60){
				grade = "B";
			}else {
				grade = "C";
			}
			return grade;
		};
		
		Predicate<Student> p = s -> s.getMarks()<80;
		
		Consumer<Student> c = s -> {
			System.out.println("Student Name is " + s.getName());
			System.out.println("Grade is " + f.apply(s));
			System.out.println();
		};
		for(Student student:students){
			if(p.test(student)){
			  c.accept(student);
			}
		}
	}

}
