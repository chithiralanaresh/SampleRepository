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
