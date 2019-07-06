package com.example.mock.builder;

import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.dto.Address;
import com.example.dto.Users;
import com.example.service.UserService;
import com.example.service.UtilService;

public class MockServiceBuilderTestNg {

	@Mock
	private UtilService utilService;
	
	@Mock
	private UserService userService;
	
	public MockServiceBuilderTestNg() {
		MockitoAnnotations.initMocks(this);
	}
	
	public UtilService buildUtilServiceMock() {
		when(utilService.getAns()).thenReturn("mock");
		when(utilService.add(1, 2)).thenReturn(2);
		
		return utilService;
	}
	
	public UserService buildUserServiceMock() {
		Users user=new Users();
		Address address=new Address();
		address.setLocation("bangalore");
		address.setPin(123);
		
		user.setAddress(address);
		user.setPhone(764547);
		user.setUserId(2);
		user.setUserName("Test");
		
		when(userService.getUserById(1)).thenReturn(user);
		
		return userService;
	}
}
