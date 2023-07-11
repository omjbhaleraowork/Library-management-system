package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.AdminDao;
import com.cdac.dto.Admin;

@Service
public class AdminServiceImple implements AdminService{

	 @Autowired
	private AdminDao adminDao;
	@Override
	public void addAdmin(Admin admin) {
		
		adminDao.insertAdmin(admin);
		
	}
	@Override
	public boolean findAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.checkAdmin(admin);
	}
	

}
