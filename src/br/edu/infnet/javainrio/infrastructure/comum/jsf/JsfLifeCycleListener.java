package br.edu.infnet.javainrio.infrastructure.comum.jsf;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class JsfLifeCycleListener implements PhaseListener {

	private static final long serialVersionUID = 1L;

	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("START PHASE " + event.getPhaseId());
	}

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("END PHASE " + event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
