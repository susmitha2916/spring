package com.vp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	/*@ExceptionHandler(value=RuntimeException.class)
	public String exceptionHandiler() {
		return "exception";
	}
*/
	@RequestMapping("/home")
	public ModelAndView home() {
		
		String s=null;  
		System.out.println(s.length()); // to genarate exception add this
		
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}
}
