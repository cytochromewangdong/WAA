package edu.mum.cs.validator;

import java.util.ArrayList;
import java.util.List;

import edu.mum.cs.domain.Calculator;

public class CalculatorValidatorImpl implements CalculatorValidator {

	@Override
	public List<String> validate(Calculator object) {

		List<String> list = new ArrayList<>();
		try {
			Integer.parseInt(object.getAdd1());
		} catch (Exception e) {
			list.add("add1 should be number");
		}
		try {
			Integer.parseInt(object.getAdd2());
		} catch (Exception e) {
			list.add("add2 should be number");
		}
		try {
			Integer.parseInt(object.getMult1());
		} catch (Exception e) {
			list.add("Mult1 should be number");
		}
		try {
			Integer.parseInt(object.getMult2());
		} catch (Exception e) {
			list.add("Mult2 should be number");
		}
		return list;
	}

}
