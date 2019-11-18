package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import practice.domain.MemberVO;
import practice.service.MemberService;


@Controller
@RequestMapping("/member")
@AllArgsConstructor
public class MemberController {
	
	private MemberService service;
	
	@GetMapping("/register")
	public void register() {
		
	}
	
	@PostMapping("/register")
	public String register(MemberVO vo) {
		service.insertUser(vo);
		return "redirect:/customLogin";
	}
}
