package com.dele.main.learn.converters;

import java.net.URI;
import java.net.URISyntaxException;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import com.dele.main.learn.models.UrlData;

@FacesConverter("com.dele.main.learn.CustomConverter")
public class CustomConverter implements Converter {
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		StringBuilder url = new StringBuilder();
		if(!value.startsWith("http://", 0)) {
			url.append("http://");
		}
		url.append(value);
		try {
			new URI(url.toString());
		}
		catch (URISyntaxException e) {
			FacesMessage msg = new FacesMessage("Error Converting Profile URL");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ConverterException(msg);
		}
		UrlData urlObj = new UrlData(url.toString());
		return urlObj;
	}
	
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return value.toString();
	}

}
