package com.SecureTodo.app.member.dto;

import java.sql.Date;

import lombok.Getter;

@Getter
public class MemberDTO {
	private int memberId;
    private String username;
    private String password;
    private String fullName;
    private String nickname;
    private Date birthDate;
    private int age;
    private int listPublicity;
    private int isWithdrawn;
    
    //비밀번호는 지우고나가게 만든 set
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
