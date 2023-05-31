package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("login")
	public String login(Model model) {
		model.addAttribute("data", "login");
		return "login";
	}	
	
	@GetMapping("signin")
	public String signin(Model model) {
		model.addAttribute("data", "sign");
		return "signin";
	}	
}
