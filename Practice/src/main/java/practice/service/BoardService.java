package practice.service;

import java.util.List;

import practice.domain.BoardPagingDto;
import practice.domain.BoardVO;

public interface BoardService {
	
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(Long bno);
	
	public List<BoardVO> getList(BoardPagingDto paging);

	public int getTotal();
}
