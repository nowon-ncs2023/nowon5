package com.green.nowon.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.green.nowon.dto.MymemoDTO;

@Mapper
public interface MyMemoMapper {

	//메모 등록
	void save(MymemoDTO dto);

	//메모리스트
	ArrayList<MymemoDTO> list();

	//메모 상세조회
	MymemoDTO findByMno(int mno);

	//메모업데이트
	
	void updateByMno(MymemoDTO mno);

	



}
