package com.warmme.study.spring.boot.Controllers;

import java.io.Serializable;

import io.swagger.annotations.ApiParam;

public abstract class AbstractRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiParam(name = "local", value = "区域(如:zn_ch)", required = true)
	private String local;

	@ApiParam(name = "zone", value = "时区(如:GMT+0)", required = true)
	private String zone;

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	/**
	 * 校验数据
	 * 
	 * @return
	 */
	public boolean validate() {
		if(!baseValidate()) {
			return false;
		}
		return paramValidate();
	}

	/**
	 * 校验基础属性
	 * @return
	 */
	private boolean baseValidate() {
		System.err.println(this.getClass().getName());
		return true;
	}

	/**
	 * 校验私有属性
	 * @return
	 */
	protected abstract boolean paramValidate();
}
