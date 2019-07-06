package com.example.service;

import java.util.List;

import com.example.dto.Users;

public interface UserService {
	
	public abstract List<Users> findAll();
	public abstract Users getUserById(long id);
	public abstract int deleteById(long id);
	public abstract int insert(Users User);
	public abstract int update(Users User);
	public abstract int[] batchCreate(List<Users> usersList);

}
