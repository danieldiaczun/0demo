package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Demo;
import com.example.repository.DemoRepository;
import com.example.service.DemoService;

public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;

	@Override
	public Demo findByName(String name) {
		
		return demoRepository.findByName(name);
	}
}
