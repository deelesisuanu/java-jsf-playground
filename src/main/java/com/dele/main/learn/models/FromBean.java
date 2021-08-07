package com.dele.main.learn.models;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FromBean implements Serializable {
	
	private static final long serialVersionUID = -7579732676114649230L;
	
	private String name;
	private String password;
	private String result = "failed";
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String checkUser() {
		if (name.equalsIgnoreCase("dele") && password.equalsIgnoreCase("123456")) {
			result = "success";
		}
		return "listeners";
	}
	
}
