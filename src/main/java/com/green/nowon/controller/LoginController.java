package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.nowon.dto.MemberDTO;
import com.green.nowon.service.SigninService;
import com.green.nowon.service.loginService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class LoginController {

	private final loginService service;
	
	@PostMapping("/login")
	public String login(MemberDTO dto, Model model) {
		model.addAttribute("data", "signin");
		service.findById(dto);
		return "redirect:/index";
	}
}
