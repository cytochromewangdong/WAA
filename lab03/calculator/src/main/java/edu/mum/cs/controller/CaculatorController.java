package edu.mum.cs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.cs.bean.CalculatorBean;

@Controller
@RequestMapping("/")
public class CaculatorController {
	@RequestMapping
	public String index() {
		return "calculator";
	}

	@PostMapping
	public String calculate(CalculatorBean bean, Model model) {

		model.addAttribute("sum", bean.getAdd1() + bean.getAdd2());
		model.addAttribute("product", bean.getMult1() + bean.getMult2());
		model.addAttribute("add1", bean.getAdd1());
		model.addAttribute("add2", bean.getAdd2());
		model.addAttribute("mult1", bean.getMult1());
		model.addAttribute("mult2", bean.getMult2());
		
		return "calculator";

	}
}
