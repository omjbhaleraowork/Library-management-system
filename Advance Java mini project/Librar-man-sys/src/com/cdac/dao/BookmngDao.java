package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Book_mng;
import com.cdac.dto.Books;


public interface BookmngDao {
	public void insertDetail(Book_mng mng);
	public List<Book_mng> selectAll(Book_mng mng);
	Book_mng selectDetails(int studentId);
	void updateDetail(Book_mng mng);

	
}
