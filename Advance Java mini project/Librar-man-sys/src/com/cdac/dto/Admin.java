package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@Column(name="admin_id")
	@GeneratedValue
	private int adminId;
	@Column(name="first_name")
	private String adminFName;
	@Column(name="last_name")
	private String adminLName;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_pass")
	private String userPass;
	@Column(name="email_id")
	private String email;
	@Column(name="contact_no")
	private String contactNo;
	
	public Admin() {
		super();
		
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminFName() {
		return adminFName;
	}

	public void setAdminFName(String adminFName) {
		this.adminFName = adminFName;
	}

	public String getAdminLName() {
		return adminLName;
	}

	public void setAdminLName(String adminLName) {
		this.adminLName = adminLName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
}
