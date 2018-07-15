package com.warmme.study.spring.boot.Controllers;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="基础响应类")
public class AbstractResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="结果编码(如:0,成功)")
	private int resultCode;

	@ApiModelProperty(value="结果说明")
	private String result;

	@ApiModelProperty(value="结果详细说明")
	private String details;

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
