package com.csutherland2020.springroo;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {

	public Users getUser(Users incompleteUser){
		
		//Here query db for this user object.
		
		Users userFromDatabase = new Users();
		userFromDatabase.setUsername("admin");
		
		return userFromDatabase;
	}
}
