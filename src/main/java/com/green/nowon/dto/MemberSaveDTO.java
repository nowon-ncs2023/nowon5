package com.green.nowon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class MemberSaveDTO {
	
	private String email;
	private String pass;
	
	public MemberDTO toMemberDTO() {
		return MemberDTO.builder()
				.email(email).pass(pass)
				.build();
				
	}

}
