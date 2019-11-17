package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;


@Controller
@RequestMapping("/member")
@AllArgsConstructor
public class MemberRegister {
	
	@GetMapping("/memberRegister")
	public void memberRegister() {
		
	}
}
