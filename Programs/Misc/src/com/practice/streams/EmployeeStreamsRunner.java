package com.practice.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStreamsRunner {
	static List<Employee> employeeList = new ArrayList<Employee>();

	public static void main(String[] args) {
		
		employeeList.add(new Employee(100, "Roshan", 30, "Male", "IT", 2018, 29900.0));
		employeeList.add(new Employee(100, "Karthik", 35, "Male", "HR", 2019, 25000.0));
		employeeList.add(new Employee(111, "Nina", 26, "Female", "IT", 2019, 26000.0));
		employeeList.add(new Employee(115, "Bunny", 45, "Male", "Admin", 2018, 35000.0));
		employeeList.add(new Employee(222, "Rakesh", 32, "Male", "HR", 2018, 25000.0));
		employeeList.add(new Employee(432, "Rekha", 23, "Female", "IT", 2020, 28000.0));
		employeeList.add(new Employee(111, "Shri", 26, "Female", "IT", 2018, 25600.0));
		employeeList.add(new Employee(115, "Purnima", 40, "Female", "Admin", 2021, 33000.0));
		employeeList.add(new Employee(222, "Abhishek", 29, "Male", "Dev", 2019, 29800.0));
		employeeList.add(new Employee(432, "Nikhil", 26, "Male", "Dev", 2020, 26000.0));
		employeeList.add(new Employee(100, "Latha", 33, "Female", "HR", 2018, 30000.0));
		employeeList.add(new Employee(111, "Mahesh", 22, "Male", "Dev", 2018, 29600.0));
		employeeList.add(new Employee(115, "Neha", 40, "Female", "HR", 2021, 30000.0));
		employeeList.add(new Employee(222, "Abhilash", 30, "Male", "Dev", 2021, 33800.0));
		employeeList.add(new Employee(432, "Adithya", 26, "Male", "IT", 2020, 27000.0));
		
		//Que 1: How many male and female employee are there in organization.
		//method1();
		//Que 2: Print the name of all departments in the organization.
		//method2();
		//Que 3: What is the average age of male and female employees.
		//method3();
		//Que 4: Get the details of highest paid employee.
		//method4();
		//Que 5: Get the name of all employees who have joined after 2020
		//method5();
		//Que 6: COunt the number of employees in each department
		//method6();
		//Que 7: WHat is the average salary of each department
		//method7();
		//Que 8: Get the details of youngest male employee in IT department
		//method8();
		//Que 9: Who has the most working experience in organization
		//method9();
		//Que 10: How many male and female employees are there in Dev department
		//method10();
		//Que 11: What is the average salary of male and female employees
		//method11();
		//Que 12: List down all the names in each department
		//method12();
		//Que 13: What is the average salary and to total salary of the organization
		//method13();
		//Que 14: Separate employees who are younger than 25 years from those employees older than 25
		//method14();
		//Que 15: Who is the oldest employee in the organization? What is he/her age and department he/her belongs to?
		//method15();
		//Que 16: What is the name of highest paid employee in each department 
		method16();
		
		
	}


	private static void method1() {
		Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmployeeGender, Collectors.counting()));
		//List<String> femaleCount = employeeList.stream().filter(e -> e.getEmployeeGender().equals("Female")).map(Employee::getEmployeeName).collect(Collectors.toList());
		//Long maleCount = employeeList.stream().count() - femaleCount;
		System.out.println(collect);
	}
	
	private static void method2() {
		List<String> departmentNames = employeeList.stream().map(Employee:: getDepartment).distinct().collect(Collectors.toList());
		System.out.println(departmentNames);
	}

	private static void method3() {
		Map<String, Double> averageAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmployeeGender, Collectors.averagingInt(Employee::getEmployeeAge)));
		//Double femaleAverageAge = employeeList.stream().filter(e -> e.getEmployeeGender().equals("Female")).collect(Collectors.averagingInt(Employee::getEmployeeAge));
		System.out.println(averageAge);
	}
	
	private static void method4() {
		Optional<Employee> max = employeeList.stream().max((e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary()));
		System.out.println(max.get().getEmployeeName());
	}
	
	private static void method5() {
		List<String> names = employeeList.stream().filter(e->e.getYearOfJoining()>2020).map(Employee::getEmployeeName).collect(Collectors.toList());
		System.out.println(names);
	}
	
	private static void method6() {
		Map<String , Long> result = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		for(Map.Entry<String, Long> map : result.entrySet()){
			System.out.println(map.getKey() +" : "+map.getValue());
		}
	}
	
	private static void method7(){
		Map<String, Double> averageSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(averageSalary);
	}
	
	private static void method8(){
		Optional<Employee> youngest = employeeList.stream().filter(e->e.getDepartment().equals("IT") && e.getEmployeeGender().equals("Male")).min((e1,e2)-> Integer.compare(e1.getEmployeeAge(), e2.getEmployeeAge()));
		System.out.println(youngest.get().getEmployeeName());
	}
	
	private static void method9(){
		Employee employee = employeeList.stream().sorted((e1,e2)->Integer.compare(e1.getYearOfJoining(), e2.getYearOfJoining())).findFirst().get();
		System.out.println(employee.getEmployeeName());
	}
	
	private static void method10(){
	Map<String, Long> map = employeeList.stream().filter(e->e.getDepartment().equals("IT")).collect(Collectors.groupingBy(Employee::getEmployeeGender, Collectors.counting()));
		System.out.println(map);
	}
	
	private static void method11(){
		Map<String, Double> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmployeeGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map);
	}
	
	private static void method12(){
		Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		for(Map.Entry<String, List<Employee>> map : collect.entrySet()){
			System.out.println(map.getKey());
			for(Employee e:map.getValue()){
				System.out.println(e.getEmployeeName());
			}
			System.out.println();
		}
	}
	
	private static void method13(){
		DoubleSummaryStatistics collect = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("The average salary is " + collect.getAverage());
		System.out.println("The total salary is " + collect.getSum());
	}
	
	private static void method14(){
		Map<Boolean, List<Employee>> collect = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getEmployeeAge()>25));
		for(Map.Entry<Boolean, List<Employee>> map : collect.entrySet()){
			if(map.getKey()){
				System.out.println("The employees older than 25 are:");
				for(Employee e : map.getValue()){
					System.out.println(e.getEmployeeName());
				}
				System.out.println();
			}else {
				System.out.println("The employees younger than 25 are: ");
				for(Employee e : map.getValue()){
					System.out.println(e.getEmployeeName());
				}
			}
		}
	}
	
	private static void method15(){
		Employee employee = employeeList.stream().max((e1,e2)->Integer.compare(e1.getEmployeeAge(), e2.getEmployeeAge())).get();
		System.out.println(employee.getEmployeeName() +" : " + employee.getEmployeeAge() +" : " + employee.getDepartment());
	}
	
	private static void method16(){
		Map<String , Employee> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
		for(Map.Entry<String, Employee> m : map.entrySet()){
			System.out.println(m.getValue().getEmployeeName());
		}
		
	}
}
