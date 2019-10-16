package practice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import practice.domain.BoardPagingDto;
import practice.domain.BoardVO;

@Mapper
public interface BoardMapper {

	public List<BoardVO> getList(BoardPagingDto paging) throws Exception;
	
	public void insert(BoardVO board) throws Exception;
	
	public BoardVO read(Long bno) throws Exception;
	
	public int delete(Long bno) throws Exception;
	
	public int update(BoardVO board) throws Exception;

	public int getTotal() throws Exception;
}
