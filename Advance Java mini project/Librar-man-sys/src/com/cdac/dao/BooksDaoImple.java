package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Books;

@Repository
public class BooksDaoImple implements BooksDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertBooks(Books books) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				session.save(books);
				tr.commit();
				session.flush();
				session.close();
				return null;
				
			}
		});
		
	}

	@Override
	public List<Books> selectAll(Books books) {
		List<Books> bookList =hibernateTemplate.execute(new HibernateCallback<List<Books>>() {

			@Override
			public List<Books> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Books");
				
				List<Books> li = q.list();
				System.out.println(li); 
				tr.commit();
				session.flush();
				session.close();
				return li;
				
			}
		});
		
		return bookList;
	}

	@Override
	public void deleteBooks(int bookId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Books(bookId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public Books selectBooks(int bookId) {
		Books books=hibernateTemplate.execute(new HibernateCallback<Books>() {

			@Override
			public Books doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Books bk = (Books)session.get(Books.class, bookId);
				tr.commit();
				session.flush();
				session.close();
				return bk;
			}
			
		});
		return books;
		
		
	}

	@Override
	public void updateBooks(Books books) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(books);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	

}
