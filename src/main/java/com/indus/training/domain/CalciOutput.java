package com.indus.training.domain;

import java.io.Serializable;

public class CalciOutput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double param1;
	private Double param2;
	private Double result;

	public CalciOutput() {
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

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "CalciOutput [param1=" + param1 + ", param2=" + param2
				+ ", result=" + result + "]";
	}

}
