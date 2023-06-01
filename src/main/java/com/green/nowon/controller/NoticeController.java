package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.nowon.dto.MemberDTO;
import com.green.nowon.dto.NoticeDTO;
import com.green.nowon.service.NoticeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class NoticeController {

	private final NoticeService service;
	
	@GetMapping("/notice")
	public String notice() {
		return "notice";
	}	
	
	@GetMapping("/notice-write")
	public String noticeWrite() {
		return "notice-write";
	}	
	
	@PostMapping("/notice-write")
	public String noticeW(Model model, NoticeDTO dto) {
		service.write(dto);
		return "notice";
	}	


}
