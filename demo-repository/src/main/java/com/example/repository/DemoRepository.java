package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Demo;

@Repository
public interface DemoRepository extends JpaRepository<Demo, Integer> {
	
	public Demo findByName(String name);
}
