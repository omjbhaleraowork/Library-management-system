package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Books;

public interface BooksDao {
	public void insertBooks(Books books);
	public List<Books> selectAll(Books books);
	void deleteBooks(int bookId);
	Books selectBooks(int bookId);
	void updateBooks(Books books);
}
