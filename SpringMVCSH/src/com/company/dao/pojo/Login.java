package com.company.dao.pojo;

import java.io.Serializable;


//Login--ORM--a_login
public class Login implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int loginId;//login_id  pk  auto_increment
	private String username;//username
	private String password;//password
	private int priority;//priority

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(int loginId, String username, String password, int priority) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
		this.priority = priority;
	}

	public Login(String username, String password, int priority) {
		super();
		this.username = username;
		this.password = password;
		this.priority = priority;
	}
	

	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

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

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", username=" + username + ", password=" + password + ", priority="
				+ priority + "]";
	}

}
