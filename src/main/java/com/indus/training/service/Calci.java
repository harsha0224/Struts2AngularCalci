package com.indus.training.service;

import com.indus.training.contract.ICalci;
import com.indus.training.domain.CalciInput;
import com.indus.training.domain.CalciOutput;

public class Calci implements ICalci {

	public Calci() {
	}

	public CalciOutput addition(CalciInput calInObj) {
		Double param1 = calInObj.getParam1();
		Double param2 = calInObj.getParam2();
		Double result = param1 + param2;

		CalciOutput calOutObj = new CalciOutput();

		calOutObj.setParam1(param1);
		calOutObj.setParam2(param2);
		calOutObj.setResult(result);

		return calOutObj;
	}

	public CalciOutput subtraction(CalciInput calInObj) {
		Double param1 = calInObj.getParam1();
		Double param2 = calInObj.getParam2();
		Double result = param1 - param2;

		CalciOutput calOutObj = new CalciOutput();

		calOutObj.setParam1(param1);
		calOutObj.setParam2(param2);
		calOutObj.setResult(result);

		return calOutObj;
	}

	public CalciOutput multiplication(CalciInput calInObj) {
		Double param1 = calInObj.getParam1();
		Double param2 = calInObj.getParam2();
		Double result = param1 * param2;

		CalciOutput calOutObj = new CalciOutput();

		calOutObj.setParam1(param1);
		calOutObj.setParam2(param2);
		calOutObj.setResult(result);

		return calOutObj;
	}

	public CalciOutput division(CalciInput calInObj) {
		Double param1 = calInObj.getParam1();
		Double param2 = calInObj.getParam2();
		Double result = param1 / param2;

		CalciOutput calOutObj = new CalciOutput();

		calOutObj.setParam1(param1);
		calOutObj.setParam2(param2);
		calOutObj.setResult(result);

		return calOutObj;
	}

}
