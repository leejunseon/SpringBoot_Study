package practice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public void register(MemberVO member) {
		
	}
	
	@PostMapping("/register")
	public String register(@Valid MemberVO member,BindingResult result,String repeatpw,RedirectAttributes rttr) {
		String resultPage="";
		
		if(result.hasErrors()) {//validation error
			log.info("Validation Error");
			List<ObjectError> list=result.getAllErrors();
			for(ObjectError error:list) {
				log.info(error.getDefaultMessage());
			}
			resultPage= "/member/register";
		}else if(!member.getUserpw().equals(repeatpw)) {//비밀번호 확인 error
			log.info("Repeat error");
			rttr.addFlashAttribute("error", "비밀번호가 일치하지 않습니다.");
			resultPage= "/member/register";
		}else {
			int insert=service.insertUser(member);
			if(insert==1) {//정상 입력
				log.info("Register success");
				rttr.addFlashAttribute("result",member.getUserid());
				resultPage= "redirect:/customLogin";
			}else if(insert==-1) {//중복 아이디
				log.info("ID reduplicate error");
				rttr.addFlashAttribute("error",member.getUserid()+"는 중복되는 아이디입니다. 다른 아이디를 사용해주세요.");
				resultPage= "/member/register";
			}
		}
		
		return resultPage;
	}
}
