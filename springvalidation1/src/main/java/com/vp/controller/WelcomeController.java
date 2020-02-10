package com.vp.controller;

import javax.validation.Valid;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vp.model.Emp;

@Controller
public class WelcomeController {
	@RequestMapping("/UserForm")
	public String regUserForm(Model model) {
		model.addAttribute("Emp", new Emp());
    	
		return "UserForm";
	}
    
    @RequestMapping("/registerNewUser")
	public String registerNewUser(@Valid @ModelAttribute("Emp") Emp emp, BindingResult result) {		
		if (result.hasErrors()) {
            return "UserForm";
        }
		
		//userService.addUser(user);
		return "success";
	}
}
