package com.indus.training.service;

import com.indus.training.contract.ICalci;
import com.indus.training.domain.CalciInput;
import com.indus.training.domain.CalciOutput;

import junit.framework.TestCase;

public class CalciTest extends TestCase {

	private ICalci calSvc;
	private CalciInput input;
	
	
	protected void setUp() throws Exception {
		super.setUp();
		calSvc=new Calci();
		input=new CalciInput();
		input.setParam1(5d);
		input.setParam2(10d);
	}
	
	public void testAdd(){
		CalciOutput expected=new CalciOutput();
		expected.setResult(15d);
		
		CalciOutput actual=calSvc.addition(input);
		
		assertEquals(expected.getResult(), actual.getResult());
	}
	public void testSub(){
		CalciOutput expected=new CalciOutput();
		expected.setResult(-5d);
		
		CalciOutput actual=calSvc.subtraction(input);
		
		assertEquals(expected.getResult(), actual.getResult());
	}
	public void testMul(){
		CalciOutput expected=new CalciOutput();
		expected.setResult(50d);
		
		CalciOutput actual=calSvc.multiplication(input);
		
		assertEquals(expected.getResult(), actual.getResult());
	}
	public void testDiv(){
		CalciOutput expected=new CalciOutput();
		expected.setResult(0.5);
		
		CalciOutput actual=calSvc.division(input);
		
		assertEquals(expected.getResult(), actual.getResult());
	}

}
