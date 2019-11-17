package practice.mapper;

import org.apache.ibatis.annotations.Mapper;

import practice.domain.AuthVO;
import practice.domain.MemberVO;

@Mapper
public interface MemberMapper {

	public MemberVO read(String userid);
	
	public int insertMember(MemberVO member);
	
	public int insertAuth(AuthVO auth);
	
}
