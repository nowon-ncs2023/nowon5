package com.green.nowon.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.ui.Model;

import com.green.nowon.dto.MemberDTO;

@Mapper
public interface LoginMapper {

	Optional<MemberDTO> findById(String email);
	
	void save(MemberDTO dto);
	
}
