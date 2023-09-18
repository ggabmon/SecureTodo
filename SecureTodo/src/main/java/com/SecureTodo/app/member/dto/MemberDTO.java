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
}
