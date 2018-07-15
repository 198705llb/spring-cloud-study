package com.warmme.study.spring.boot.Controllers.hello;

import com.warmme.study.spring.boot.Controllers.AbstractRequest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

@ApiModel(value="Hello 请求类")
public class HelloRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiParam(name = "id", value = "id", required = true)
	@ApiModelProperty(value="id")
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
