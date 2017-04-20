package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.converter.Item;

@Service
public interface ItemService {
	
	Item findByName(String name);
}
