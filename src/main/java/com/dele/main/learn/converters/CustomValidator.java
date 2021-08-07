package com.dele.main.learn.converters;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.dele.main.learn.CustomValidator")
public class CustomValidator implements Validator {
	
	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		int age = Integer.parseInt(value.toString());
		
		if(age < 21 || age > 65) {
			FacesMessage message = new FacesMessage("Invalid Age Range Should be (21 -65)");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
		
	}
	

}
