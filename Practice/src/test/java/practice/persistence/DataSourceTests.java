package practice.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import practice.config.RootConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
@Slf4j
public class DataSourceTests {
	
	@Setter(onMethod_= {@Autowired})
	private DataSource dataSource;
	
	@Test
	public void testConnection() {
		try(Connection con=dataSource.getConnection()){
			log.info(con.toString());
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
}
