package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.converter.Item;
import com.example.repository.ItemRepository;
import com.example.service.ItemService;

public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

	@Override
	public Item findByName(String name) {
		
		return itemRepository.findByName(name);
	}
}
