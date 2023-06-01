package com.green.nowon.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//@Getter //roleName 사용하기위해 getter 사용할수도있음
@RequiredArgsConstructor
public enum MyRole {//Enum 데이터 타입 두가지 지원 : ordinal(int형) / name(String)	
	
	USER("ROLE_USER", "일반사용자"), 
	ADMIN("ROLE_ADMIN", "관리자");

	private final String roleName;
	private final String koName;
	
	public final String roleName() {
		return roleName;
	}
	public final String koName() {
		return koName;
	}
	
	
}
