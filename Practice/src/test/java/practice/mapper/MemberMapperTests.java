package practice.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import practice.domain.AuthVO;
import practice.domain.MemberVO;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MemberMapperTests {

	@Autowired
	private MemberMapper mapper;
	
	/*@Test
	public void testMapper() {
		log.info(mapper.toString());
	}*/
	
	@Test
	public void testRead() {
		MemberVO vo=mapper.read("ljs921026");
		log.info(vo.toString());
		for(AuthVO auth:vo.getAuthList()) {
			log.info(auth.toString());
		}
	}
}
