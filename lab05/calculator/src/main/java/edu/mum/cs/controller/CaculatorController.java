package edu.mum.cs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.cs.bean.CalculatorBean;

@Controller
@RequestMapping("/")
public class CaculatorController {
	@RequestMapping
	public String index(@ModelAttribute("calculator") CalculatorBean bean,
			@RequestParam(value = "string", required = false) String greeting, Model model) {
		if (greeting != null) {
			model.addAttribute(greeting);
		}
		return "calculator";
	}

	@PostMapping
	public String calculate(CalculatorBean bean, RedirectAttributes redirect) {

		bean.setSum(bean.getAdd1() + bean.getAdd2());
		bean.setProduct(bean.getMult1() * bean.getMult2());
		redirect.addFlashAttribute("calculator", bean);
		redirect.addAttribute("awsome!");

		return "redirect:/";

	}
}
