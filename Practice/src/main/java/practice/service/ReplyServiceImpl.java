package practice.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import practice.domain.Replies;
import practice.domain.ReplyPagingDto;
import practice.domain.ReplyVO;
import practice.mapper.ReplyMapper;

@Service
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService{
	
	private ReplyMapper mapper;

	@Override
	public int register(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.insert(vo);
	}

	@Override
	public ReplyVO get(Long rno) throws Exception {
		// TODO Auto-generated method stub
		return mapper.read(rno);
	}

	@Override
	public int modify(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.update(vo);
	}

	@Override
	public int remove(Long rno) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delete(rno);
	}

	@Override
	public Replies getReplies(Long bno, ReplyPagingDto paging) throws Exception {
		// TODO Auto-generated method stub
		return new Replies(mapper.getCountByBno(bno),mapper.getReplies(bno,paging));
	}

}
