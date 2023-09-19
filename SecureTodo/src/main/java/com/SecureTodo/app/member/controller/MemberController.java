package com.SecureTodo.app.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
@Controller
public class MemberController {
	
	
	/* 전체 유저를 불러오기 */
	@RequestMapping("/admin")
	public String adminMember(Model model) {
		
		return "admin/adminUser";
	}
}
