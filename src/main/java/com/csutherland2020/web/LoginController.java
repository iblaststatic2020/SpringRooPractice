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

import com.csutherland2020.springroo.Users;
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
		model.addAttribute("user", new Users());
		return "user/login";
	}

	/*private void createAccountTypes(Model model) {
		List<String> accountTypes = new ArrayList<String>();
		List<String> countries = new ArrayList<String>();
		
		accountTypes.add("free");
		accountTypes.add("bronze");
		accountTypes.add("silver");
		accountTypes.add("gold");
		
		countries.add("USA");
		countries.add("Canada");
		countries.add("Japan");
		countries.add("Germany");
		countries.add("England");
		model.addAttribute("mySpecialAccountTypes", accountTypes);
		model.addAttribute("countries", countries);
	}
	*/
	/**
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(@ModelAttribute("user") Users user, Locale locale, Model model) {
	
		
		Users userFromDatabase = loginService.isUsernameAndPasswordValid(user);
		
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
