package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	@Id
	@Column(name="book_id")
	@GeneratedValue
	private int bookId;
	@Column(name="category")
	private String category;
	@Column(name="book_name")
	private String bookName;
	@Column(name="quantity")
	private int quantity;
	@Column(name="price")
	private float price;
	@Column(name="rack_no")
	private int rackNo;
	
	@Column(name="uniq_id")
	private String UniqId;
	

	public String getUniqId() {
		return UniqId;
	}


	public void setUniqId(String uniqId) {
		UniqId = uniqId;
	}


	public Books() {
		super();
		
	}
	
	
	public Books(int bookId) {
		super();
		this.bookId = bookId;
	}


	

	public Books(String category) {
		super();
		this.category = category;
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getRackNo() {
		return rackNo;
	}
	public void setRackNo(int rackNo) {
		this.rackNo = rackNo;
	}
	
	
    
}
