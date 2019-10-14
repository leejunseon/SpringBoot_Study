package board;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import board.board.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BoardApplicationTests {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList() throws Exception {
		mapper.selectBoardList().forEach(board->log.info(board.toString()));
	}
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testSqlSession() throws Exception{
		System.out.println(dataSource);
		System.out.println(sqlSession.toString());
	}
}
