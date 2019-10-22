package practice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import practice.domain.ReplyPagingDto;
import practice.domain.ReplyVO;
import practice.service.ReplyService;

@RestController
@RequestMapping("/replies/")
@AllArgsConstructor
public class ReplyController {
	
	private ReplyService service;
	
	@PostMapping(value="/new",consumes="application/json",produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> register(@RequestBody ReplyVO vo) throws Exception{
		int insertCount=service.register(vo);
		return insertCount==1?new ResponseEntity<>("success",HttpStatus.OK):new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping(value="/pages/{bno}/{page}",produces= {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<List<ReplyVO>> getReplies(@PathVariable("page")int page,@PathVariable("bno")Long bno) throws Exception{
		ReplyPagingDto paging=new ReplyPagingDto(page,10);
		return new ResponseEntity<>(service.getReplies(bno, paging),HttpStatus.OK);
	}
}
