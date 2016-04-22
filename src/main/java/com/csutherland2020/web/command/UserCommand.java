package com.csutherland2020.web.command;

import java.util.List;

public class UserCommand {
	private String username;
	private String password;
	private String confirmPassword;
	private String accountType;
	private Boolean termsOfService;
	private List<String> selectedCountries;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Boolean getTermsOfService() {
		return termsOfService;
	}
	public void setTermsOfService(Boolean termsOfService) {
		this.termsOfService = termsOfService;
	}
	public List<String> getSelectedCountries() {
		return selectedCountries;
	}
	public void setSelectedCountries(List<String> selectedCountries) {
		this.selectedCountries = selectedCountries;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	

}
