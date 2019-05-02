package edu.mum.cs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.data.DataFacade;

@Controller
public class AuthenticationController {

	@Autowired
	private DataFacade dataFacade;

	@RequestMapping("/action/login")
	public String index() {
		return "index";
	}

	@PostMapping("/action/login")
	public String login(@RequestParam("name") String name, @RequestParam("password") String password, Model model) {
		String expectedPassword = dataFacade.findPassword(name);
		if(expectedPassword == null || !expectedPassword.equals(password)) {
			
			return "index";
		} else {
			
//			PrintWriter writer = response.getWriter();
//			response.setContentType("text/html");
//			response.setHeader("Cache-Control", "no-cache");
//			writer.println("<!DOCTYPE html>");
//			writer.println("<head><meta charset=\"ISO-8859-1\"><title>Insert title here</title></head>");
//
//			writer.println("<body><h2>Login Successful</h2>");
//			writer.println("<p /><form action=\"login\" method=\"get\">");
//			writer.println("<input type = \"submit\" value = \"Back\"/>");
//			writer.println("</form>	</body>	</html>");
			return "display";
	//		response.sendRedirect("../LoginSuccessful.html");			
		}
	}
}
