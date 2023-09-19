package com.SecureTodo.app.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SecureTodo.app.member.dto.MemberDTO;

public interface MemberService {
	
	public List<MemberDTO> findAllMember(); 
	
	public String findPwById(String id);
	
	public MemberDTO selectMemberById(String id);
}
