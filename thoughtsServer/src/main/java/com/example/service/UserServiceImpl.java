package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dto.Users;
import com.example.repo.UserDAO;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userRepo;
	
	@Override
	public Users getUserById(long id) {
		
		Users user = userRepo.findById(id);
		return user;
	}

	@Override
	public List<Users> findAll() {
		List<Users> usersList = userRepo.findAll();
		return usersList;
	}

	@Override
	public int deleteById(long id) {
		int deleteCount = userRepo.deleteById(id);
		return deleteCount;
	}

	@Override
	public int insert(Users User) {
		int userInserted = userRepo.insert(User);
		return userInserted;
	}

	@Override
	public int update(Users User) {
		int updatedUser = userRepo.update(User);
		return updatedUser;
	}

	@Override
	public int[] batchCreate(List<Users> usersList) {
		int[] batchUser = userRepo.batchCreate(usersList);
		return batchUser;
	}

}
