package com.example.springbootaspose.service;

import java.util.ArrayList;
import java.util.List;

import com.example.springbootaspose.model.Employee;

public class EmployeeService {

	public static List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			Employee employee = new Employee(i, "A" + i, "A" + i + "gmail.com", 20 + i);
			employeeList.add(employee);
		}
		return employeeList;
	}
}
