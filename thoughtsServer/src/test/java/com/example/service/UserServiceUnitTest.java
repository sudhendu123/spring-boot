package com.example.service;


import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.dto.Address;
import com.example.dto.Users;
import com.example.repo.UserDAO;

@RunWith(SpringRunner.class)
@WebMvcTest()
public class UserServiceUnitTest {

	@MockBean
	private UserDAO userRepo;
	
	/*@InjectMocks
	UserService user=new UserServiceImpl();*/
	
	//@BeforeClass
	public void setters() {
		Users user=new Users();
		Address address=new Address();
		address.setLocation("bangalore");
		address.setPin(123);
		
		user.setAddress(address);
		user.setPhone(764547);
		user.setUserId(2);
		user.setUserName("Test");

		when(userRepo.findById(1)).thenReturn(user);
	}
	@Test
	public void getUserByIdTest() {
		Users user=new Users();
		Address address=new Address();
		address.setLocation("bangalore");
		address.setPin(123);
		
		user.setAddress(address);
		user.setPhone(764547);
		user.setUserId(2);
		user.setUserName("Test");

		when(userRepo.findById(1)).thenReturn(user);
		
		Users users = userRepo.findById(1);
		System.out.println(users);
		//assertEquals("mock repo",userRepo.findById(1));
	}
}
