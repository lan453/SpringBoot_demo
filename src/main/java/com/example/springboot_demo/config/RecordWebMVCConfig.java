package com.example.springboot_demo.config;

import java.io.File;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RecordWebMVCConfig implements WebMvcConfigurer{
	
	@Value("${studentimportresult.resourceHandler}")
	private String excelResourceHandler;
	
	@Value("${studentimportresult.location}")
	private String excelResourceLocation;

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		registry.addMapping("/mgt/**").allowedOriginPatterns("*").allowedMethods("*")
		.allowedHeaders("*").allowCredentials(true);
		registry.addMapping("/varlet/**").allowedOriginPatterns("*").allowedMethods("*")
				.allowedHeaders("*").allowCredentials(true);
	
	}
	@PostConstruct
	public void init() {
		
		File file = new File(this.excelResourceLocation);
		if(!file.exists()) {
			file.mkdirs();
		}
		
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println(this.excelResourceHandler);
		System.out.println(this.excelResourceLocation);
		registry.addResourceHandler(this.excelResourceHandler).addResourceLocations(this.excelResourceLocation);
	}
}
