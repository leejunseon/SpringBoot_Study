package practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
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
	public List<ReplyVO> getReplies(Long bno, ReplyPagingDto paging) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getReplies(bno, paging);
	}

}
