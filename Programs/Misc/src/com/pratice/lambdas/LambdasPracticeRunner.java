package com.pratice.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdasPracticeRunner {

	public static void main(String[] args) {
		Student s1 = new Student(1,"ABC");
		Student s2 = new Student(2,"MNO");
		Student s3 = new Student(3,"XYZ");
		Student s4 = new Student(4,"GHI");
		
		List<Student> l = new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		System.out.println(l);
		List<Student> collectList = l.stream().sorted((s5,s6)-> s6.getName().compareTo(s5.getName())).collect(Collectors.toList());
		//System.out.println(collectList);
		LinkedHashSet<Student> collectLinkedHashSet = l.stream().sorted((s7,s8)->s7.getName().compareTo(s8.getName())).collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(collectLinkedHashSet);
		
		Map<Student,String> map = new HashMap<Student, String>();
		map.put(s1, "First");
		map.put(s3, "Third");
		map.put(s4, "Fourth");
		map.put(s2, "Second");
		//System.out.println(map);
		Set<Entry<Student, String>> entrySet = map.entrySet();
		//System.out.println(entrySet);
		
//		for(Entry<Student, String> s : map.entrySet()){
//			System.out.println(s.getKey()+ " "+ s.getValue());
//		}
		
		Map<Student, String> collect2 = map.entrySet().stream().sorted((e1,e2)->
			Integer.compare(e2.getKey().getId(),e1.getKey().getId())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
					(e3,e4)-> e3 , LinkedHashMap::new));
		//System.out.println(collect2);
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(3);
		System.out.println(intList);
		Set<Integer> set = new HashSet<>();
		for(Integer i : intList){
			if(!set.add(i)){
				System.out.println(i);
			}
		}

		Student ns1 = new Student(1,"ABC");
		Student ns2 = new Student(2,"ABC");
		Student ns4 = new Student(3,"GEF");
		Student ns3 = new Student(4,"ABC");
		List<Student> sList = Arrays.asList(ns1, ns2, ns3,ns4);
		Map<String, List<Student>> groupBy = sList.stream().collect(Collectors.groupingBy(Student::getName));
		System.out.println(groupBy);
		
	}

}
