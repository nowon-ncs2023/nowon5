package com.green.nowon.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class NoticeDTO {

	private long no;
	private String title;
	private String id;
	private String content;
	private LocalDateTime created_date;	
	private LocalDateTime updated_date;	
}
