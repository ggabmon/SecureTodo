package com.SecureTodo.app.member.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO {
	private int memberId;
    private String username;
    private String password;
    private String fullName;
    private String nickname;
    private Date birthDate;
    private int age;
    private boolean listPublicity;
    private boolean isWithdrawn;
}
