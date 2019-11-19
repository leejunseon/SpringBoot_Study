package practice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import practice.domain.MemberVO;
import practice.service.MemberService;


@Controller
@RequestMapping("/member")
@AllArgsConstructor
@Slf4j
public class MemberController {
	
	private MemberService service;
	
	@GetMapping("/register")
	public void register() {
		
	}
	
	@PostMapping("/register")
	public String register(@Valid MemberVO member,BindingResult result) {
		if(result.hasErrors()) {
			log.info("Validation Error");
			List<ObjectError> list=result.getAllErrors();
			for(ObjectError error:list) {
				log.info(error.toString());
			}
			return "/member/register";
		}else {
			service.insertUser(member);
			return "redirect:/customLogin";
		}
	}
}
