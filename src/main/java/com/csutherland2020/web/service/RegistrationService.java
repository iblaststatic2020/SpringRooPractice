package com.csutherland2020.web.service;

import org.springframework.stereotype.Service;

import com.csutherland2020.web.command.UserCommand;

@Service
public class RegistrationService {
	
	public UserCommand doPasswordsMatch(UserCommand userCommand){
		
		
		if("".equals(userCommand.getUsername()) || "".equals(userCommand.getPassword())){
			return null;
		}
		return userCommand;
		
	}

}
