package com.csutherland2020.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csutherland2020.springroo.LoginDao;
import com.csutherland2020.springroo.Users;


	@Service
	public class LoginService {
		@Autowired
		LoginDao loginDao;
		

		public Users isUsernameAndPasswordValid(Users user){
			
			/*if(user.getUsername().equals("admin"));{
				if(user.getPassword().equals("pass12"));{
					return true;
				}
				
			}*/
			
			if("".equals(user.getUsername()) || "".equals(user.getPassword())){
				return null;
			}
			
			Users userFromDatabase = loginDao.getUser(user);
			return userFromDatabase;
			
		}

}
