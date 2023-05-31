package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.nowon.dto.MemberDTO;
import com.green.nowon.service.SigninService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class SigninController {

	private final SigninService service;
	
	@PostMapping("/signin")
	public String signin(MemberDTO dto, Model model) {
		model.addAttribute("data", "signin");
		service.save(dto);
		return "redirect:/login";
	}	
}
