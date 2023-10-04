package com.practice.springmvc.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DaughterController {

	@ResponseBody
	@RequestMapping("/makeupkit")
	public String getMakeupKit() {
		return "Given make up kit";
	}
	
	@ResponseBody
	@RequestMapping("/books")
	public String getBooks() {
		return "Given books";
	}
}
