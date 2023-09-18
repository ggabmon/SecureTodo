package com.SecureTodo.app.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.SecureTodo.app.member.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	List<MemberDTO> selectAllMember();
	
	MemberDTO selectMemberById(int id);
}
