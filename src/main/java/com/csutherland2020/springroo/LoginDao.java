package com.csutherland2020.springroo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class LoginDao {

	@PersistenceContext
	EntityManager em;
	
	public void createUser(User user){
		
		Session session = (Session) em.getDelegate();
		
		//THis writes to db.
		session.save(user);
		
		
	}
	
	
	public User getUser(User user){
		
		//Here query db for this user object.
		
		Session session = (Session) em.getDelegate();
		
		List<User> userList = session.createCriteria(User.class)
				.add(Restrictions.eq("username", user.getUsername()))
				.add(Restrictions.eq("password", user.getPassword()))
				.list();
		if(userList.isEmpty()){
			return null;
		}
		else {
			return userList.get(0);
		}
		
	}
}
