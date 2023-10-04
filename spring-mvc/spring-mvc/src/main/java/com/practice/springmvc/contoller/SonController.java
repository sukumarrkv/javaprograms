package com.practice.springmvc.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/son")
public class SonController {

	//@ResponseBody
	@RequestMapping("/cricketbat")
	public String giveCricketBat() {
		return "Cricketbat";
	}
}
