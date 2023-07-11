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
import com.cdac.dto.User;

@Repository
public class UserDaoImple implements UserDao {

	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void insertUser(User user) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				session.save(user);
				tr.commit();
				session.flush();
				session.close();
				return null;
			
			}
		});
		
	}
	@Override
	public boolean checkUser(User user) {
		
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where userName = ? and userPass = ?");
				q.setString(0, user.getUserName());
				q.setString(1, user.getUserPass());
				List<User> li = q.list();
				boolean flag = !li.isEmpty();
				
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
			
		});
		return b;
		
	
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

}
