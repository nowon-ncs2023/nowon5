package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.nowon.dto.MemberDTO;
import com.green.nowon.dto.MemberSaveDTO;
import com.green.nowon.service.SignupService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class SignupController {

	private final SignupService service;
	
	@PostMapping("/signup")
	public String signup(MemberSaveDTO dto) {
		service.save(dto);
		return "/login";
	}	
}
