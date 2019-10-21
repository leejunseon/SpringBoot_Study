package practice.mapper;

import org.apache.ibatis.annotations.Mapper;

import practice.domain.ReplyVO;

@Mapper
public interface ReplyMapper {
	
	public int insert(ReplyVO vo) throws Exception;
	
	public ReplyVO read(Long rno) throws Exception;
	
	public int delete(Long rno) throws Exception;
	
	public int update(ReplyVO reply) throws Exception;
}
