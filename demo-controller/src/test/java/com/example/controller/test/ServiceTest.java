package com.example.controller.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.Demo;
import com.example.service.DemoService;

@RunWith(SpringRunner.class)
@SpringBootTest
//@TestPropertySource({"classpath:application-test.properties", "classpath:sql-server.properties"})
@TestPropertySource({"classpath:application-test.properties", "classpath:h2.properties"})
public class ServiceTest {

	@Autowired
	private DemoService demoService;
	
	@Test
	public void contextLoads() {
		
		String name = "osv";
		Demo demo = demoService.findByName(name);

		if (demo != null) {
			System.out.println(demo.getName());
		}
	}
}
