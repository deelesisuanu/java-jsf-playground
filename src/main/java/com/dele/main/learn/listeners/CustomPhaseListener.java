package com.dele.main.learn.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class CustomPhaseListener implements PhaseListener {
	
	private static final long serialVersionUID = -2713404997611773480L;

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("AFTER PHASE ID: " + event.getPhaseId().toString());
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("BEFORE PHASE ID: " + event.getPhaseId().toString());
		if(event.getPhaseId() == PhaseId.INVOKE_APPLICATION) {
			System.out.println("The Application Has Just Been Invoked");
		}
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
	
}
