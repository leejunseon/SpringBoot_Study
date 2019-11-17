package practice.service;

import practice.domain.AuthVO;
import practice.domain.MemberVO;

public interface MemberService {

	public int insertMember(MemberVO member);
	
	public int insertAuth(AuthVO auth);
	
}
