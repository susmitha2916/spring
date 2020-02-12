package com.vp.expn;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class AdviceController {
	@ExceptionHandler(value=RuntimeException.class)
	public String exceptionHandiler() {
		return "exception";
		
		
		}
	}

