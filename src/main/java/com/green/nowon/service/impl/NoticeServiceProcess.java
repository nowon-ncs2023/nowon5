package com.green.nowon.service.impl;

import org.springframework.stereotype.Service;

import com.green.nowon.dto.NoticeDTO;
import com.green.nowon.mapper.NoticeMapper;
import com.green.nowon.service.NoticeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class NoticeServiceProcess implements NoticeService {

	//private final NoticeMapper mapper;
	
	@Override
	public void write(NoticeDTO dto) {
		// TODO Auto-generated method stub
		//mapper.write(); 
	}

}
