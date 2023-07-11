package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.BookmngDao;

import com.cdac.dto.Book_mng;


@Service
public class BookmngServiceImple implements BookmngService{

	@Autowired
	private BookmngDao bookmngDao;

	@Override
	public void addDetail(Book_mng mng) {
		bookmngDao.insertDetail(mng);
		
	}

	@Override
	public List<Book_mng> selectAll(Book_mng mng) {
		
		return bookmngDao.selectAll(mng);
	}

	@Override
	public Book_mng findDetail(int studentId) {
		// TODO Auto-generated method stub
		return bookmngDao.selectDetails(studentId);
	}

	@Override
	public void modifyBooks(Book_mng mng) {
	  bookmngDao.updateDetail(mng);
		
	}

	

}
