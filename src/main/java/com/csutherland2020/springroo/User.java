package com.csutherland2020.springroo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name="Users")
public class User {

    private Long id;

    private String username;

    private String password;
    
    private String accountType;

   
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

	private Boolean termsOfService;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

   
}
