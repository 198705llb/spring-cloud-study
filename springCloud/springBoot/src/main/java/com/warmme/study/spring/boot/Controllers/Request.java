package com.warmme.study.spring.boot.Controllers;

public class Request extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected boolean paramValidate() {
		return true;
	}

}
