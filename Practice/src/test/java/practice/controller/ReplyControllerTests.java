package practice.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import practice.domain.ReplyVO;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ReplyControllerTests {

	@Setter(onMethod_= {@Autowired})
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc=MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	/*@Test
	public void testRegister() throws Exception{
		log.info(mockMvc.perform(post("/replies/new")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"bno\":\"20\",\"reply\":\"컨트롤러테스트~\",\"replyer\":\"user\"}"))
				.andReturn()
				.getResponse()
				.getContentAsString()
				);
	}*/
	
	@Test
	public void testGetReplies() throws Exception{
		log.info(mockMvc.perform(get("/replies/pages/20/1"))
				.andReturn()
				.getResponse()
				.getContentAsString()
				);
	}
}
