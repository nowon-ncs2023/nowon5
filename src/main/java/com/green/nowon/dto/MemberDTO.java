package com.green.nowon.dto;

import java.util.Set;

import com.green.nowon.security.MyRole;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MemberDTO {
	private long no;
	private String email;
	private String pass;
	private String nickName;
	
	private Set<MyRole> roles;
}
