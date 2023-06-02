package com.green.nowon.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.nowon.dto.ProductsDTO;
import com.green.nowon.service.ProductsService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ProductsController {

	private final ProductsService service;
	
	//홈 이동
	@GetMapping("/home")
	public String home() {
		return "/index";
	}
	
	//상품등록 페이지 이동
	@GetMapping("/products-registration")
	public String productsReg() {
		return "/products/products-registration";
	}
	
	//상품등록
	@PostMapping("/products-save")
	public String productsSave(ProductsDTO dto, Model model) {
		service.productsSave(dto);
		ArrayList<ProductsDTO> productsList = service.list();
		model.addAttribute("list", productsList);
		return "/index";
	}
	
	//상품등록 페이지 출력
	@GetMapping("/products-list")
	public String productsList(Model model) {
		ArrayList<ProductsDTO> productsList = service.list();
		model.addAttribute("list", productsList);
		return "/products/products-list";
	}
	
	//상품 게시글 조회
	@GetMapping("/products/{no}")
	public String detail(@PathVariable(name = "no") int pcode, Model model) {
		//@PathVariable(name = "no") //url의 변수를 값을 매핑할때 사용 
		//path변수와 파라미터 변수이름을 다르게 쓸경우 name속성 지정 같은면 생략가능
		//Model model 객체: 페이지에 데이터 전달이 필요한경우 파라미터 변수로 선언하면 됨
		service.detail(pcode, model);
		return "/products/products-detail";
	}
	
	
}
