package com.indus.training.domain;

import java.io.Serializable;

public class CalciInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double param1;
	private Double param2;

	public CalciInput() {
	}

	public Double getParam1() {
		return param1;
	}

	public void setParam1(Double param1) {
		this.param1 = param1;
	}

	public Double getParam2() {
		return param2;
	}

	public void setParam2(Double param2) {
		this.param2 = param2;
	}

	@Override
	public String toString() {
		return "CalciInput [param1=" + param1 + ", param2=" + param2 + "]";
	}

}
