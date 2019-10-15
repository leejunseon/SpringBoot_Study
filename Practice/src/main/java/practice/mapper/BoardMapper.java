package practice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import practice.domain.BoardPagingDto;
import practice.domain.BoardVO;

@Mapper
public interface BoardMapper {

	public List<BoardVO> getList(BoardPagingDto paging);
	
	public void insert(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);

	public int getTotal();
}
