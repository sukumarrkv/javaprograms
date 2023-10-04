package com.example.springbootaspose.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.example.springbootaspose.model.Employee;

@Service
public class ExcelService {

	public String saveEmployeesToExcel() throws Exception {
		List<Employee> employeeList = EmployeeService.getAllEmployees();
		Workbook workbook = new Workbook("C:\\Users\\Sukumar\\Desktop\\Dummy\\Excel\\Employees.xlsx");
		Worksheet worksheet = workbook.getWorksheets().get("Employees");
		AtomicInteger rowNumber = new AtomicInteger(1);
		Long employeeListSize = employeeList.stream().count();
		if (employeeListSize > 3) {
			worksheet.getCells().insertRows(rowNumber.get() + 1, (employeeListSize.intValue()) - 3);
		}
		employeeList.stream().forEach(employee -> {
			worksheet.getCells().get(rowNumber.get(), 0).setValue(employee.getId());
			worksheet.getCells().get(rowNumber.get(), 1).setValue(employee.getName());
			worksheet.getCells().get(rowNumber.get(), 2).setValue(employee.getEmail());
			worksheet.getCells().get(rowNumber.get(), 3).setValue(employee.getAge());
			rowNumber.getAndIncrement();
		});
		String date = new SimpleDateFormat("mmddyyyy").format(new Date());
		workbook.save("C:\\Users\\\\Sukumar\\Desktop\\Dummy\\Excel\\Employees_" + date + ".xlsx");
		String jobId = UUID.randomUUID().toString();
		workbook.save("C:\\Users\\\\Sukumar\\Desktop\\Dummy\\Excel\\" + jobId + ".xlsx");
		return "Succesfully saved employees data to excel";
	}

	public InputStream getExcelFile(String jobId) throws FileNotFoundException {
		File file = new File("C:\\Users\\Sukumar\\Desktop\\Dummy\\Excel\\" + jobId + ".xlsx");
		return new FileInputStream(file);
	}
}
