package com.example.repo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dto.Users;

@Repository
public class UserRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private final String batchSql="insert into Use (id, phone,name,pin,location) " + "values(?,?, ?,?,?)";

	public List<Users> findAll() {
		return jdbcTemplate.query("select * from Use", new UserRowMapper());
	}

	public Users findById(long id) {
		/*
		 * return jdbcTemplate.queryForObject("select * from Use where id=?", new
		 * Object[] { id }, new BeanPropertyRowMapper<Users>(Users.class));
		 */
		return jdbcTemplate.queryForObject("select * from Use where id=?", new Object[] { id }, new UserRowMapper());
	}

	public int deleteById(long id) {
		return jdbcTemplate.update("delete from Use where id=?", new Object[] { id });
	}

	public int insert(Users User) {
		return jdbcTemplate.update("insert into Use (id, phone,name,pin,location) " + "values(?,?, ?,?,?)",
				new Object[] { User.getUserId(), User.getPhone(), User.getUserName(), User.getAddress().getPin(),
						User.getAddress().getLocation() });
	}

	public int update(Users User) {
		return jdbcTemplate.update("update Use " + " set name = ?, location = ? " + " where id = ?",
				new Object[] { User.getUserName(), User.getAddress().getLocation(), User.getUserId() });
	}

	public int[] batchCreate(List<Users> usersList) {
		return jdbcTemplate.batchUpdate(batchSql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Users users = usersList.get(i);
				ps.setLong(1, users.getUserId());
				ps.setInt(2, users.getPhone());
				ps.setString(3, users.getUserName());
				ps.setInt(4, users.getAddress().getPin());
				ps.setString(5, users.getAddress().getLocation());
			}

			@Override
			public int getBatchSize() {
				return usersList.size();
			}

		});
	}
}
