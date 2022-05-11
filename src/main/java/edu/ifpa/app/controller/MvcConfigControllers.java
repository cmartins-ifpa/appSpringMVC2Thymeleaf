package edu.ifpa.app.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigControllers implements WebMvcConfigurer {
    
	// este metodo adiciona os controladores de requisiçoes URL (rotas)
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("homepage");
		registry.addViewController("/").setViewName("homepage");
		registry.addViewController("/hello").setViewName("hello");
		 
	}
}
