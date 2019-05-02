package edu.mum.cs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.data.DataFacade;

@Controller
public class AdviceController {

	@Autowired
	private DataFacade dataFacade;
	
	@RequestMapping("/action/advice")
	public String advice(@RequestParam("roast") String roast, Model model) {
		List<String> adviceList = dataFacade.getAdvice(roast);
		model.addAttribute("adviceList", adviceList);
		model.addAttribute("roast", roast.toUpperCase());
		return "advice";
	}
}
