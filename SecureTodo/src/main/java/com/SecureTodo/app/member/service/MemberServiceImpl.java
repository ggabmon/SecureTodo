package com.SecureTodo.app.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureTodo.app.member.dto.MemberDTO;
import com.SecureTodo.app.member.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberRepository memberRepository;
	
	@Override
	public List<MemberDTO> findAllMember() {
		List<MemberDTO> members = memberRepository.findAllMember();
		return members;
	}

}
