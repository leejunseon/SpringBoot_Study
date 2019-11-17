package practice.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import practice.domain.AuthVO;
import practice.domain.MemberVO;
import practice.mapper.MemberMapper;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService{
	
	private MemberMapper mapper;

	@Override
	public int insertMember(MemberVO member) {
		// TODO Auto-generated method stub
		return mapper.insertMember(member);
	}

	@Override
	public int insertAuth(AuthVO auth) {
		// TODO Auto-generated method stub
		return mapper.insertAuth(auth);
	}

}
