package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/member")
public class MemberRegister {
	
	@GetMapping("/memberRegister")
	public void memberRegister() {
		
	}
}
