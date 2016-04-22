package com.csutherland2020.springroo;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {

	public User getUser(User incompleteUser){
		
		//Here query db for this user object.
		
		User userFromDatabase = new User();
		userFromDatabase.setUsername("admin");
		
		return userFromDatabase;
	}
}
