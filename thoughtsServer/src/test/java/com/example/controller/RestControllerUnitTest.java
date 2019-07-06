package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.dto.Address;
import com.example.dto.Users;
import com.example.service.UserService;
import com.example.service.UtilService;

@RunWith(SpringRunner.class)
@WebMvcTest(value =RestControllers.class)
public class RestControllerUnitTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	@Qualifier(value="getUtilServiceImpl")
	UtilService utilService;
	
	@MockBean
	UserService userService;
	
	@Test	
	public void getByUserIdUnitTest() {
		Users user=new Users();
		Address address=new Address();
		address.setLocation("bangalore");
		address.setPin(123);
		
		user.setAddress(address);
		user.setPhone(764547);
		user.setUserId(2);
		user.setUserName("Test");
		
		Mockito.when(utilService.getAns()).thenReturn("mock ans");
		Mockito.when(utilService.add(1, 2)).thenReturn(7);
		Mockito.when(userService.getUserById(1)).thenReturn(user);
				
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/User/fetch/{id}",1).accept(
				MediaType.APPLICATION_JSON);
		
		try {
			MvcResult result = mockMvc.perform(requestBuilder).andReturn();
			System.out.println(result.getResponse());
			/*ResultActions resultAction = mockMvc.perform(get("/User/fetch/{id}", 1)
					.contentType(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON));*/
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
