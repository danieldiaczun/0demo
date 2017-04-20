package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Demo;
import com.example.service.DemoService;

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

	@RequestMapping(name="/demo")
	@ResponseBody
	public String demo() {
		
		Demo demo = demoService.findByName("osv");
		
		System.out.println("Name: " + demo.getName());
		System.out.println("Edad: " + demo.getEdad());
		
		return demo.getName();
	}
}
