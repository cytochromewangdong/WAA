package edu.mum.cs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import edu.mum.cs.domain.Calculator;
import edu.mum.cs.validator.CalculatorValidator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;

@Controller
public class CaculatorController {
	@RequestMapping("/")
	public String index() {

		return "/WEB-INF/views/calculator.jsp";
	}

	@AutoWired
	CalculatorValidator calculatorValidator;

	@RequestMapping("/calculate")
	public String calculate(Calculator calculator, HttpServletRequest request) {

		List<String> errors = calculatorValidator.validate(calculator);

		if (errors.isEmpty()) {
			calculator.setSum(String.valueOf(Integer.parseInt(calculator.getAdd1()) + Integer.parseInt((calculator.getAdd2()))));
			calculator.setProduct(String.valueOf(Integer.parseInt(calculator.getMult1()) * Integer.parseInt(calculator.getMult2())));
			request.setAttribute("calculator", calculator);
		} else {
			request.setAttribute("errors", errors);
			request.setAttribute("calculator", calculator);
		}
		return "/WEB-INF/views/calculator.jsp";

	}
}
