package com.dele.main.learn;

import java.awt.event.ActionEvent;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Actions implements Serializable {
	
	private static final long serialVersionUID = 3817756173582203158L;
	
	private String data = "Result Show";
	
	public String showResult() {
		return "listeners";
	}
	
	public void updateData(ActionEvent e) {
		data = "New Data";
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
