package com.green.nowon.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.green.nowon.dto.MemberDTO;
import com.green.nowon.dto.MemberSaveDTO;
import com.green.nowon.mapper.LoginMapper;
import com.green.nowon.service.SignupService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SignupServiceProcess implements SignupService {

	private final LoginMapper mapper;
	
	
	@Override
	public void saveProcess(MemberSaveDTO dto) {
		
		MemberDTO entity = dto.toMemberDTO();
		mapper.save(entity);
		mapper.role(dto);

	}
	

}
