package com.green.nowon.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.nowon.dto.NoticeDTO;
import com.green.nowon.service.NoticeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class NoticeController {

	private final NoticeService service;
	
	
	//게시글 등록 페이지 이동
	@GetMapping("/notice-write")
	public String noticeWrite() {
		return "/notices/notice-write";
	}
	
	//게시판 등록
	@PostMapping("/notice-save")
	public String noticeWriteAdd(Model model, NoticeDTO dto) {
		service.noticeSave(dto);
		List<NoticeDTO> noticeList = service.list();
		model.addAttribute("list", noticeList);
		return "redirect:/notice";
	}	

	//게시판 등록 페이지 출력
	@GetMapping("/notice")
	public String noticeList(Model model) {
		List<NoticeDTO> noticeList = service.list();
		model.addAttribute("list", noticeList);
		return "/notices/notice";
	}
	
	//게시글 번호 -> 게시글 상세 조회
	@GetMapping("/notice/{no}")
	public String noticeDetail(@PathVariable(name = "no") int no, Model model) {
		service.noticeDetail(no, model);
		return "/notices/notice-detail";
	}

}
