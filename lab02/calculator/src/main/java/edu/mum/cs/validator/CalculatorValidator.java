package edu.mum.cs.validator;

import java.util.List;

import edu.mum.cs.domain.Calculator;

public interface CalculatorValidator {
	public List<String> validate(Calculator object) ;
}
