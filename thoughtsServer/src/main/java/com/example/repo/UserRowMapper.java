package com.example.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.dto.Address;
import com.example.dto.Users;



public class UserRowMapper implements RowMapper<Users>{

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users user=new Users();
		Address address=new Address();
		user.setUserId(rs.getInt("id"));
		user.setPhone(rs.getInt("phone"));
		user.setUserName(rs.getString("name"));
		address.setLocation(rs.getString("location"));
		address.setPin(rs.getInt("pin"));
		user.setAddress(address);
		return user;
	}

}
