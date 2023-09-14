package com.SecureTodo.app.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SecureTodo.app.member.dto.MemberDTO;

@Service
public interface MemberService {
	
	public List<MemberDTO> findAllMember(); 
}
