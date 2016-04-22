package com.csutherland2020.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csutherland2020.springroo.User;
import com.csutherland2020.web.service.LoginService;


@Controller
@RequestMapping("user")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		//createAccountTypes(model);
		model.addAttribute("user", new User());
		return "user/login";
	}

	
	/**
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(@ModelAttribute("user") User user, Locale locale, Model model) {
	
		
		User userFromDatabase = loginService.isUsernameAndPasswordValid(user);
		
		if(userFromDatabase != null){
			model.addAttribute("user", userFromDatabase); 
			return "app/home";
		}
		else{
			model.addAttribute("result", "Invalid Username and Password");
			return "user/login";
		}
		
		
	}
	
	
}
