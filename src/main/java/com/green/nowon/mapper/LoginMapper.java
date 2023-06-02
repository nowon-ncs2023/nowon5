package com.green.nowon.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.ui.Model;

import com.green.nowon.dto.MemberDTO;
import com.green.nowon.dto.MemberSaveDTO;
import com.green.nowon.dto.RoleDTO;

@Mapper
public interface LoginMapper {

	Optional<MemberDTO> findById(String email);
	
	void save(MemberDTO dto);
	void role(MemberSaveDTO dto);
	
}
