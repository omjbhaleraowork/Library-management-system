package com.cdac.service;

import java.util.List;

import com.cdac.dto.Books;
import com.cdac.dto.User;

public interface UserService {
	void addUser(User user);
	boolean findUser(User user);
	List<Books> selectAll(Books books);
}
