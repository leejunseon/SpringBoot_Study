package practice.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DataSourceTests {
	
	@Setter(onMethod_= {@Autowired})
	private DataSource dataSource;
	
	@Setter(onMethod_={@Autowired})
	private SqlSessionFactory sqlSessionFactory;
		
	@Test
	public void testConnection() {
		try(Connection con=dataSource.getConnection()){
			log.info(con.toString());
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testMyBatis() {
		try(SqlSession session=sqlSessionFactory.openSession();
			Connection con=session.getConnection();){
			log.info(session.toString());
			log.info(con.toString());
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
}
