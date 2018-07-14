package com.warmme.study.spring.boot.Controllers.hello;

import org.springframework.web.bind.annotation.RequestParam;

import com.warmme.study.spring.boot.Controllers.AbstractRequest;

import io.swagger.annotations.ApiParam;

public class HelloRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiParam(name = "id", value = "id", required = true)
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	protected boolean paramValidate() {
		System.err.println(this.getClass().getName());
		return true;
	}

}
