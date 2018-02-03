package com.sample.unitTest.Unittest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;

@RunWith(SpringRunner.class)
//@SpringBootTest
@WebMvcTest(UnitController.class)
public class UnittestApplicationTests {

	/*@Test
	public void contextLoads() {
	}*/
	
	@Autowired
	private MockMvc mvc;
	
	
	@Test
	public void testController() throws Exception{
		System.out.println("test started");
		mvc.perform(get("/unittest/ping")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
		
	}
	
	
	

}
