package com.csutherland2020.web;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user")
public class RegisterController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		createAccountTypes(model);
		return "user/register";
	}
	
	private void createAccountTypes(Model model) {
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
	
}
