package com.SecureTodo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
		
	@GetMapping("/main")
	public String showTodo(Model model) {
		System.out.println("showTodo 접근");
		model.addAttribute("todo", "todo 입니당.");
		return "todo";
	}
}
