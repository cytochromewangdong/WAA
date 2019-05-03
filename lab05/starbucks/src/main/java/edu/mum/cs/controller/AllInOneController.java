package edu.mum.cs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.mum.cs.entity.User;
import edu.mum.data.DataFacade;

@SessionAttributes({ "user" })
@Controller
public class AllInOneController {

	@Autowired
	private DataFacade dataFacade;

	@RequestMapping("/action/login")
	public String index() {
		return "index";
	}

	@PostMapping("/action/login")
	public String login(@RequestParam("name") String name, @RequestParam("password") String password, Model model) {
		String expectedPassword = dataFacade.findPassword(name);
		if (expectedPassword == null || !expectedPassword.equals(password)) {
			return "index";
		} else {
			model.addAttribute("user", new User(name, expectedPassword));
			return "display";
		}

	}
	
	
	@RequestMapping("/action/advice")
	public String advice(@RequestParam("roast") String roast, Model model) {
		List<String> adviceList = dataFacade.getAdvice(roast);
		model.addAttribute("adviceList", adviceList);
		model.addAttribute("roast", roast.toUpperCase());
		return "advice";
	}
	
	@RequestMapping("/action/logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		return "redirect:/action/login";
	}
}
