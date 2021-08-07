package com.dele.main.learn.listeners;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

import com.dele.main.learn.Countries;

public class LocaleChangeListener implements ValueChangeListener {

	@Override
	public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
		Countries country = (Countries)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("country");
		country.setSelectedCountry(event.getNewValue().toString());
	}

}
