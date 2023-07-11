package com.cdac.service;

import java.util.List;

import com.cdac.dto.Book_mng;
import com.cdac.dto.Books;


public interface BookmngService {
	public void addDetail(Book_mng mng);
	List<Book_mng> selectAll(Book_mng mng);
	Book_mng findDetail(int studentId);
	void modifyBooks(Book_mng mng);
	

}
