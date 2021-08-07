package com.dele.main.learn;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "bean", eager = true)
public class BeanData {
	
	public String[] data = {
			"Male",
			"Female",
			"Rather Not Say",
			"Not your Business"
	};
	
	public String[] getData() {
		return data;
	}
	
	public void setData(String[] data) {
		this.data = data;
	}

}
