package com.green.nowon.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}	
	
	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("data", "sign");
		return "signup";
	}	
}
