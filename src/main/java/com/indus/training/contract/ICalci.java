package com.indus.training.contract;

import com.indus.training.domain.CalciInput;
import com.indus.training.domain.CalciOutput;

public interface ICalci {

	public CalciOutput addition(CalciInput calInObj);

	public CalciOutput subtraction(CalciInput calInObj);

	public CalciOutput multiplication(CalciInput calInObj);

	public CalciOutput division(CalciInput calInObj);
}
