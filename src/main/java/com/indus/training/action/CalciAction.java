package com.indus.training.action;

import com.indus.training.contract.ICalci;
import com.indus.training.domain.CalciInput;
import com.indus.training.domain.CalciOutput;
import com.indus.training.service.Calci;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CalciAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CalciInput calInObj;
	private CalciOutput calOutObj;
	private Calci calObj = new Calci();

	public CalciAction() {
	}

	public CalciInput getCalInObj() {
		return calInObj;
	}

	public void setCalInObj(CalciInput calInObj) {
		this.calInObj = calInObj;
	}

	public Calci getCalObj() {
		return calObj;
	}

	public void setCalObj(Calci calObj) {
		this.calObj = calObj;
	}

	public CalciOutput getCalOutObj() {
		return calOutObj;
	}

	public void setCalOutObj(CalciOutput calOutObj) {
		this.calOutObj = calOutObj;
	}

	public String add() {

		calOutObj = calObj.addition(calInObj);
		return SUCCESS;
	}

	public String sub() {

		calOutObj = calObj.subtraction(calInObj);
		return SUCCESS;
	}

	public String mul() {

		calOutObj = calObj.multiplication(calInObj);
		return SUCCESS;
	}

	public String div() {

		calOutObj = calObj.division(calInObj);
		return SUCCESS;
	}

}
