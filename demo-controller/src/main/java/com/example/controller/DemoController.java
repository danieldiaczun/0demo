package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.converter.Item;
import com.example.model.converter.MonetaryAmount;
import com.example.service.ItemService;

@Controller
public class DemoController {

    @Autowired
    private ItemService itemService;

	@RequestMapping(name="/demo")
	@ResponseBody
	public String demo() {
		
		/*Demo demo = demoService.findByName("osv");
		
		System.out.println("Name: " + demo.getName());
		System.out.println("Edad: " + demo.getEdad());*/

		Item item = itemService.findByName("osv");
		MonetaryAmount monetaryAmount = item.getBuyNowPrice();
		System.out.println("Currency: " + monetaryAmount.getCurrency());
		System.out.println("Value: " + monetaryAmount.getValue());

		return "ready";
	}
}
