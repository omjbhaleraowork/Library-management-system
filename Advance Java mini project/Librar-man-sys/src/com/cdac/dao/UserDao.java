package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Books;
import com.cdac.dto.User;

public interface UserDao {
	
	void insertUser(User user);
	boolean checkUser(User user);
	public List<Books> selectAll(Books books);

}
