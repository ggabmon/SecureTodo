package com.SecureTodo.app.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureTodo.app.member.dto.MemberDTO;
import com.SecureTodo.app.member.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public List<MemberDTO> findAllMember() {
		return memberMapper.selectAllMember();
	}

	@Override
	public String findPwById(String id) {
		return memberMapper.findPwById(id);
	}

	@Override
	public MemberDTO selectMemberById(String id) {
		return memberMapper.selectMemberById(id);
	}

}
