package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.BooksDao;
import com.cdac.dto.Books;

@Service
public class BooksServiceImple implements BooksService{

	@Autowired
	private BooksDao booksDao;
	@Override
	public void addBooks(Books books) {
		booksDao.insertBooks(books);
		
	}
	@Override
	public List<Books> selectAll(Books books) {
		
		return booksDao.selectAll(books);
	}
	@Override
	public void removeBooks(int bookId) {
		booksDao.deleteBooks(bookId);
		
	}
	@Override
	public Books findBooks(int bookId) {
		
		return booksDao.selectBooks(bookId);
	}
	@Override
	public void modifyBooks(Books books) {
		booksDao.updateBooks(books);
		
	}
	
	

}
