package com.mostafayehia.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {

	// controller method for showing the form.
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// controller method for processing form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		
		String studentName = request.getParameter("studentName"); 
		
		studentName = studentName.toUpperCase(); 
		
		String result = "YO! "+ studentName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name,Model model) {
		
		String studentName = name.toUpperCase();
		
		String result = "request param is  "+ studentName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
