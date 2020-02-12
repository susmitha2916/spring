package com.vp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Component
@EnableWebMvc
@ComponentScan(basePackages = "com.vp")
public class AppConfig {

	 public ViewResolver viewResolver() {
		 
		 InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		 resolver.setViewClass(JstlView.class);
		 resolver.setPrefix("/WEB-INF/views");
		 resolver.setSuffix(".jsp");
		 
		 
		 
		 
		 return resolver;
		 
	 }
}
