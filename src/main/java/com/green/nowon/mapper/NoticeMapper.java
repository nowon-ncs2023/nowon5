package com.green.nowon.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.green.nowon.dto.NoticeDTO;

@Mapper
public interface NoticeMapper {
	
	// NoticeDTO findAll(int no, String title);

	void write();
	
}
