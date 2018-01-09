package org.cartboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "UserDetail")
public class UserDetail implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private String id;
	@Column(name = "Email",nullable = false)
	private String email;
	@Column
	private String Username;
	@Column
	private Long Mobile;
	@Column
	private String Password;
	@Column
	private String ConfirmPassword;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public Long getMobile() {
		return Mobile;
	}
	public void setMobile(Long mobile) {
		Mobile = mobile;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	
	
	/*
	 * TODO 
	 * 
	 * add remaining userName,password as per the above
	 * 
	 * generate constructor 
	 * setters and getters
	 * toString method
	 */

}
