package com.x.processplatform.service.processing.processor.manual;

import com.x.base.core.project.exception.RunningException;

class ExceptionManualNotRoute extends RunningException {

	private static final long serialVersionUID = 9085364457175859374L;

	ExceptionManualNotRoute(String manualId) {
		super("manual found no routes, id:{}.", manualId);
	}

}
