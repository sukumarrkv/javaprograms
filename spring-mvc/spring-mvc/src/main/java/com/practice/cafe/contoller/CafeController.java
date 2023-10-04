package com.practice.cafe.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CafeController {

	@RequestMapping("/welcome")
	public String welcomePage(Model model) {
		String welcomeMessage=  "Hello please enter the food item you wish to order";
		model.addAttribute("welcomeMessage", welcomeMessage);
		return "welcome-page";
	}
	
	@RequestMapping("/processorder")
	public String processOrder(HttpServletRequest request, Model model) {
		String foodItem   = request.getParameter("foodItem");
		model.addAttribute("foodItem", foodItem);
		return "process-order";
	}
}
