package com.catalog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {
	
	
	@GetMapping("/demo-string")
	public String demo(){
		return "Hello Ken's Facebook Friends";
	}

}
