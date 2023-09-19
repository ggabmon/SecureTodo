package com.SecureTodo.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SecureTodo.app.member.dto.MemberDTO;
import com.SecureTodo.app.member.service.MemberService;


@Controller
public class HomeController {
		
	@Autowired
	MemberService memberService;
	
	/* 회원목록페이지 */
	@GetMapping("/todo")
	public String showTodo(Model model) {
		model.addAttribute("todo", "todo 입니당.");
		List<MemberDTO> memberList = memberService.findAllMember();
		model.addAttribute("MemberList", memberList);
		return "todo/list";
	}
	
	/* 회원가입페이지로 */
	@RequestMapping("/signupForm")
	public String signupForm() {
		return "member/signupForm";
	}

	

}
