package com.dele.main.learn;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "customRegister", eager = true)
@RequestScoped
public class CustomRegistration implements Serializable {
	
	private static final long serialVersionUID = 1106432472303250125L;
	
	String name, email, pass, cpass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	
	public void validateFullName(FacesContext context, UIComponent component, Object value) {
		String nValue = value.toString();
		if(nValue.isEmpty() || nValue.contains("!") || nValue.contains("@") || nValue.contains("$")) {
			throw new ValidatorException(new FacesMessage("Please Provide Valid Full Name"));
		}
	}
	
	public String registerUser() {
		
		return "about";
	}
	
	public void showMessages(String msg) {
	}

}
