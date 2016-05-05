package com.csutherland2020.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csutherland2020.springroo.LoginDao;
import com.csutherland2020.springroo.User;


	@Service
	public class LoginService {
		@Autowired
		LoginDao loginDao;
		

		public User isUsernameAndPasswordValid(User user){
			
			/*if(user.getUsername().equals("admin"));{
				if(user.getPassword().equals("pass12"));{
					return true;
				}
				
			}*/
			
			if("".equals(user.getUsername()) || "".equals(user.getPassword())){
				return null;
			}
			
			
			/*User userFromDatabase = loginDao.getUser(user);*/
			return user;
			
		}
		
		public User usernameValidation(User user){
			
			if(user.getUsername().length() >= 2 && user.getPassword().length() >= 6){
				
				return user;
			}
			else{
				return null;
			}
			
			
		}


		public void createUser(User user) {
			// TODO Auto-generated method stub
			loginDao.createUser(user);
		}

}
