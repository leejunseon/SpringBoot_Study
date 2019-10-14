package practice.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import practice.domain.BoardVO;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
	/*@Test
	public void testGetList(){
		List<BoardVO> list=mapper.getList();
		for(BoardVO vo:list) {
			log.info(vo.toString());
		}
	}*/
	
	/*@Test
	public void testInsert(){
		BoardVO board=new BoardVO();
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 작성하는 내용");
		board.setWriter("newbie");
		
		mapper.insert(board);
		
		log.info(board.toString());
	}*/
	
	/*@Test
	public void testRead() {
		BoardVO board=mapper.read(3L);
		log.info(board.toString());
	}*/
	
	/*@Test
	public void testDelete() {
		log.info("delete count: "+mapper.delete(3L));
	}*/
	
	/*@Test
	public void testUpdate() {
		BoardVO board=new BoardVO();
		
		board.setBno(1L);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		board.setWriter("user00");
		
		int count=mapper.update(board);
		log.info("update count: "+count);
	}*/
}
