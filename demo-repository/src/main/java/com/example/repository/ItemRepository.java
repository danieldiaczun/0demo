package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.converter.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
	
	public Item findByName(String name);
}
