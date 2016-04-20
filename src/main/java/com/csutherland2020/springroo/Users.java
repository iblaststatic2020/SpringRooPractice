package com.csutherland2020.springroo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


@Entity

public class Users {
	
    private Long id;
    private String username;
    private String password;

	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
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
