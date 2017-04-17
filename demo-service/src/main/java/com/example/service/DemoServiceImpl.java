package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Demo;
import com.example.repository.DemoRepository;

public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;

	@Override
	public Demo findByName(String name) {
		
		return demoRepository.findByName(name);
	}
}
