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
	@GetMapping("/main")
	public String showTodo(Model model) {
		System.out.println("showTodo 접근");
		model.addAttribute("todo", "todo 입니당.");
		List<MemberDTO> memberList = memberService.findAllMember();
		model.addAttribute("MemberList", memberList);
		System.out.println("toString 출력");
		for(MemberDTO member : memberList) {
			System.out.println(member);
		}
		return "todo";
	}
	
	/* 회원가입페이지로 */
	@RequestMapping("/signupForm")
	public String signupForm() {
		return "member/signupForm";
	}
}
