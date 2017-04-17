package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Demo;

@Service
public interface DemoService {
	
	Demo findByName(String name);

}
