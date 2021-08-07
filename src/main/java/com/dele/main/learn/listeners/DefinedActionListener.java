package com.dele.main.learn.listeners;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class DefinedActionListener implements ActionListener {
	
	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
//		Actions action = (Actions) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("actions");
//		action.setData("New Data.");
		System.out.println("Action Performed");
	}

}
