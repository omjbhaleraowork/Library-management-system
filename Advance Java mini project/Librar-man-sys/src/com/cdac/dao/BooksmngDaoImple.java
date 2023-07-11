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

import com.cdac.dto.Book_mng;
import com.cdac.dto.Books;


@Repository
public class BooksmngDaoImple implements BookmngDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertDetail(Book_mng mng) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				session.save(mng);
				tr.commit();
				session.flush();
				session.close();
				return null;
				
			}
		});
		
	}

	@Override
	public List<Book_mng> selectAll(Book_mng mng) {
		List<Book_mng> bookList =hibernateTemplate.execute(new HibernateCallback<List<Book_mng>>() {

			@Override
			public List<Book_mng> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Book_mng");
				
				List<Book_mng> li = q.list();
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
	public Book_mng selectDetails(int studentId) {
		Book_mng mng=hibernateTemplate.execute(new HibernateCallback<Book_mng>() {

			@Override
			public Book_mng doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Book_mng bk = (Book_mng)session.get(Book_mng.class, studentId);
				tr.commit();
				session.flush();
				session.close();
				return bk;
			}
			
		});
		return mng;
	}

	@Override
	public void updateDetail(Book_mng mng) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(mng);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}






	

}
