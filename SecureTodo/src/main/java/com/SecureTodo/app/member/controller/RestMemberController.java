package com.SecureTodo.app.member.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SecureTodo.app.member.dto.MemberDTO;
import com.SecureTodo.app.member.service.MemberService;

import jakarta.servlet.http.HttpSession;

@RestController
public class RestMemberController {
		
	@Autowired
	MemberService memberService;
	
	/* 로그인 로직 */
	@PostMapping("/loginCheck")
	public ResponseEntity<?> login(@RequestBody Map<String,String> credentials, HttpSession session){
		//로그인 id와 pw 파라미터 수신
		String id = credentials.get("id");
		String pw = credentials.get("pw");
		System.out.println("RestMemberController 아이디와 비번 " +id+" "+pw);
		
		String AuthPw = memberService.findPwById(id);
		System.out.println("받아온 비밀번호는 " +AuthPw);
		//id에 맞는 비밀번호 조회 후 동일여부 검사 후 리턴
		if(pw.equals(AuthPw)) {
			MemberDTO user = memberService.selectMemberById(id);
			user.setPassword("****");
			session.setAttribute("USER",user);
			System.out.println(pw==AuthPw);
			return ResponseEntity.ok("Login Success");
		}else{
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login Failed");
		}
	}
	
	
	
}
