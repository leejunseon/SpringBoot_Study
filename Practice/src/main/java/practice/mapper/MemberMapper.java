package practice.mapper;

import org.apache.ibatis.annotations.Mapper;

import practice.domain.MemberVO;

@Mapper
public interface MemberMapper {

	public MemberVO read(String userid);
	
}
