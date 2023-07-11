package com.cdac.service;

import java.util.List;

import com.cdac.dto.Books;

public interface BooksService {
	public void addBooks(Books books);
	List<Books> selectAll(Books books);
	void removeBooks(int bookId);
	Books findBooks(int bookId);
	void modifyBooks(Books books);
	

}
