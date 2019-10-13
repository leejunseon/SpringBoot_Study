package board;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.Setter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardApplicationTests {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Setter(onMethod_= {@Autowired})
	private DataSource dataSource;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testSqlSession() throws Exception{
		System.out.println(dataSource);
		System.out.println(sqlSession.toString());
	}
}
