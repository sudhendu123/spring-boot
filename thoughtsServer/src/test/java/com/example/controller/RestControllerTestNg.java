package com.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes =GoodTestApplication.class)

@WebAppConfiguration
@SpringBootTest
@TestPropertySource("classpath:application.properties")
@ContextConfiguration({ "/spring-service.xml","/spring-persistence.xml"})
public class RestControllerTestNg extends AbstractTestNGSpringContextTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;
	
	//UtilService utilService;

	@BeforeClass
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		//utilService=mock(UtilService.class);
	}
	
	@AfterClass
	public final void destroy() {
		mockMvc = null;
	}
		
	@Test	
	public void getByUserIdTest() {
		try {
			ResultActions resultAction = mockMvc.perform(get("/User/fetch/{id}", 1)
					.contentType(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON));
			resultAction.andExpect(status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	  
	 

}
