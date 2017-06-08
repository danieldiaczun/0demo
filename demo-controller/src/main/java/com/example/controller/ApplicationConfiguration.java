package com.example.controller;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.DemoService;
import com.example.service.DemoServiceImpl;

@Configuration
public class ApplicationConfiguration {
	
    @Bean
    ServletRegistrationBean<WebServlet> h2servletRegistration() {
        ServletRegistrationBean<WebServlet> registrationBean = new ServletRegistrationBean<WebServlet>(new WebServlet());
        registrationBean.addUrlMappings("/console/*");	
        return registrationBean;
    }
    
    @Bean
    DemoService demoService() {
        DemoService demoService = new DemoServiceImpl();
        return demoService;
    }

}