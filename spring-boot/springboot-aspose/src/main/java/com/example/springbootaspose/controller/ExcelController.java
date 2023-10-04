package com.example.springbootaspose.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootaspose.service.ExcelService;

@RestController
@RequestMapping("/excel")
public class ExcelController {

	@Autowired
	private ExcelService excelService;

	@GetMapping("/save")
	public String saveEmployeesToExcel() throws Exception {
		return excelService.saveEmployeesToExcel();
	}

	@GetMapping("/download/{jobid}")
	public ResponseEntity<?> downloadExcel(@PathVariable("jobid") String jobId) throws FileNotFoundException {
		String contentType = "application/octet-stream";
		String headerValue = "attachment; filename=employees.xlsx";
//		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
//				.header("COntent-Disposition", headerValue).body(excelService.getExcelFile(jobId));
		File file = new File("C:\\Users\\Sukumar\\Desktop\\Dummy\\Excel\\" + jobId + ".xlsx");
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=employees.xlsx")
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.contentLength(file.length()) //
				.body(new FileInputStream(file));
	}

	@GetMapping("/{message}")
	public String hello(@PathVariable String message) {
		return "Hello " + message;
	}
}
