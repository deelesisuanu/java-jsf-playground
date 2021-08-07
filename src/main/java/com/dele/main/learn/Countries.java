package com.dele.main.learn;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class Countries implements Serializable {
	
	private static final long serialVersionUID = -1025825591199585844L;
	private static Map<String, String> countries;
	private String selectedCountry = "Nigeria";
	
	static {
		countries = new LinkedHashMap<String, String>();
		countries.put("uk", "United Kingdom");
		countries.put("ng", "Nigeria");
		countries.put("sa", "South Africa");
		countries.put("us", "United States of America");
		countries.put("ky", "Kenya");
		countries.put("gh", "Ghana");
		countries.put("au", "Australia");
		countries.put("it", "Italy");
	}
	
	public void localChanged(ValueChangeEvent e) {
		selectedCountry = e.getNewValue().toString();
	}

	public Map<String, String> getCountries() {
		return countries;
	}
	
	public String getSelectedCountry() {
		return selectedCountry;
	}

	public void setSelectedCountry(String selectedCountry) {
		this.selectedCountry = selectedCountry;
	}

}
