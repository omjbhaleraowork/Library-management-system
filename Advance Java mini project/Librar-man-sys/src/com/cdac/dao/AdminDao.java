package com.cdac.dao;

import com.cdac.dto.Admin;

public interface AdminDao {
	
	void insertAdmin(Admin admin);
	boolean checkAdmin(Admin admin);

}
