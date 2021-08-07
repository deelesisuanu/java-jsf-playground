package com.dele.main.learn;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "jsfintro", eager = true)
public class Faces {
	
	public Faces() {
		System.out.println("Faces Class Has been started!!!");
	}
	
	public String displayMessage() {
		return "Welcome to this JSF Class :: I wish you luck";
	}

}
